// This software is released into the Public Domain.  See copying.txt for details.
package io.github.villseriol.osmosis.reports.generator;

import java.io.IOException;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import io.github.villseriol.osmosis.reports.config.ReportFormat;
import io.github.villseriol.osmosis.reports.model.CharacterMappingRecord;
import io.github.villseriol.osmosis.reports.template.CharacterMappingReportCsv;
import io.github.villseriol.osmosis.reports.template.CharacterMappingReportYaml;
import io.github.villseriol.osmosis.transliterate.v0_6.TransliteratePipelineBuilder;
import io.github.villseriol.osmosis.transliterate.v0_6.config.loader.XmlLoader;
import io.github.villseriol.osmosis.transliterate.v0_6.config.model.NormalizeConfiguration;
import io.github.villseriol.osmosis.transliterate.v0_6.unicode.UnicodeRange;
import io.github.villseriol.osmosis.transliterate.v0_6.unicode.Unimap;


public final class CharacterMappingReportGenerator {
    private static final XmlLoader<NormalizeConfiguration> LOADER = XmlLoader.getInstance(NormalizeConfiguration.class);

    private final ReportFormat format;
    private final Path configFile;
    private final Unimap unimap;

    public CharacterMappingReportGenerator(final ReportFormat format, final Path configFile) {
        this.format = format;
        this.configFile = configFile;

        NormalizeConfiguration configuration = LOADER.load(configFile.toString());
        this.unimap = new TransliteratePipelineBuilder(configuration).build();
    }


    public ReportFormat getFormat() {
        return format;
    }


    public Path getConfigFile() {
        return configFile;
    }


    public static Map<UnicodeRange, Collection<CharacterMappingRecord>> process(final Unimap unimap) {
        Map<UnicodeRange, Collection<CharacterMappingRecord>> model = new HashMap<>();

        for (UnicodeRange range : UnicodeRange.values()) {
            int lower = Math.max(range.getLower(), 0);
            int upper = Math.min(range.getUpper(), Character.MAX_CODE_POINT);

            for (int codePoint = lower; codePoint <= upper; codePoint++) {
                if (codePoint >= Character.MIN_SURROGATE && codePoint <= Character.MAX_SURROGATE) {
                    continue;
                }

                String from = new String(Character.toChars(codePoint));
                String output = unimap.action(from);

                if (Character.isDefined(codePoint)) {
                    model.computeIfAbsent(range, key -> new ArrayList<>())
                            .add(new CharacterMappingRecord(codePoint, output));
                }
            }
        }

        return model;
    }


    public void generate(Path output) throws IOException {
        Map<UnicodeRange, Collection<CharacterMappingRecord>> model = process(unimap);

        switch (format) {
        case YAML:
            new CharacterMappingReportYaml(model).generate(output);
            break;

        case CSV:
            // output is a directory; one file per unicode range is written into it
            new CharacterMappingReportCsv(model).generate(output);
            break;

        default:
            throw new IllegalStateException("Unsupported report format: " + format);
        }
    }
}
