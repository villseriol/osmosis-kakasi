// This software is released into the Public Domain.  See copying.txt for details.
package org.villseriol.osmosis.kakasi.v0_6;

import java.util.Collection;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.stream.Collectors;

import org.openstreetmap.osmosis.core.container.v0_6.EntityContainer;
import org.openstreetmap.osmosis.core.domain.v0_6.Entity;
import org.openstreetmap.osmosis.core.domain.v0_6.EntityType;
import org.openstreetmap.osmosis.core.domain.v0_6.Tag;
import org.openstreetmap.osmosis.core.task.v0_6.Sink;
import org.openstreetmap.osmosis.core.task.v0_6.SinkSource;
import org.villseriol.osmosis.kakasi.v0_6.configuration.UserConfigurationLoader;
import org.villseriol.osmosis.kakasi.v0_6.configuration.model.UserConfiguration;


public class KakasiTask implements SinkSource {
    private static final Logger LOG = Logger.getLogger(KakasiTask.class.getName());
    private final KakasiPipeline pipeline = new KakasiPipeline();
    private final UserConfigurationLoader loader = UserConfigurationLoader.getInstance();

    private Sink sink;
    private UserConfiguration configuration = new UserConfiguration();
    private Set<String> tagMatches = new HashSet<>();

    public KakasiTask(final String configFile) {
        LOG.log(Level.FINE, "Kakasi configured with " + configFile);
        this.configuration = loader.load(configFile);
    }


    @Override
    public void process(EntityContainer entityContainer) {
        Entity entity = entityContainer.getEntity();
        Collection<Tag> entityTags = entity.getTags();
        EntityType entityType = entity.getType();

        boolean skip = (configuration.isExcludeNodes() && EntityType.Node == entityType)
                || (configuration.isExcludeRelations() && EntityType.Relation == entityType)
                || (configuration.isExcludeWays() && EntityType.Way == entityType);

        if (skip) {
            sink.process(entityContainer);
            return;
        }

        Collection<Tag> matching = entityTags.stream().filter((t) -> tagMatches.contains(t.getKey()))
                .collect(Collectors.toList());
        if (matching.isEmpty()) {
            sink.process(entityContainer);
            return;
        }

        process(entityContainer, matching);
    }


    /**
     * An inner process method that applies the transformations to the entity
     * container.
     *
     * @param entityContainer the entity container
     * @param entityTags the list of filtered tags
     *
     * @implNote The propagated entity container is a proxy to the actual entity
     *           container.
     */
    private void process(EntityContainer entityContainer, Collection<Tag> entityTags) {
        EntityContainer writeableEntityContainer = entityContainer.getWriteableInstance();
        Entity writableEntity = writeableEntityContainer.getEntity();
        Collection<Tag> writableEntityTags = writableEntity.getTags();

        Collection<Tag> tagsToRemove = new HashSet<>();
        Collection<Tag> tagsToUpdate = new HashSet<>();

        for (Tag tag : entityTags) {
            String key = tag.getKey();
            String original = tag.getValue();
            String value = pipeline.run(original);
            Tag next = new Tag(key, value);

            tagsToRemove.add(tag);
            tagsToUpdate.add(next);
        }

        writableEntityTags.removeAll(tagsToRemove);
        writableEntityTags.addAll(tagsToUpdate);

        sink.process(writeableEntityContainer);
    }


    @Override
    public void initialize(Map<String, Object> metaData) {
        sink.initialize(metaData);

        pipeline.init(configuration);

        this.tagMatches = configuration.getTagEntries().stream().map((e) -> e.getKey()).collect(Collectors.toSet());
    }


    @Override
    public void complete() {
        sink.complete();
    }


    @Override
    public void close() {
        sink.close();
    }


    @Override
    public void setSink(Sink sink) {
        this.sink = sink;
    }
}
