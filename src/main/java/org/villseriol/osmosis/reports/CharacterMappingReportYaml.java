// This software is released into the Public Domain.  See copying.txt for details.
package org.villseriol.osmosis.reports;

import java.io.IOException;
import java.io.OutputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;

import org.villseriol.osmosis.transliterate.v0_6.unicode.UnicodeRange;

import tools.jackson.databind.ObjectMapper;
import tools.jackson.dataformat.yaml.YAMLMapper;
import tools.jackson.dataformat.yaml.YAMLWriteFeature;


public class CharacterMappingReportYaml {
    private static final Logger LOG = Logger.getLogger(CharacterMappingReportYaml.class.getName());

    private static final String ID_FORMAT = "U+%04X";

    private static final String ID_KEY = "id";
    private static final String FROM_KEY = "from";
    private static final String TO_KEY = "to";

    private Map<UnicodeRange, Collection<CharacterMappingRecord>> data;

    public CharacterMappingReportYaml(Map<UnicodeRange, Collection<CharacterMappingRecord>> data) {
        this.data = data;
    }


    public Map<UnicodeRange, Collection<CharacterMappingRecord>> getData() {
        return data;
    }


    public void setData(Map<UnicodeRange, Collection<CharacterMappingRecord>> data) {
        this.data = data;
    }


    private ObjectMapper setup() {
        // Glyphs are quoted unconditionally (no MINIMIZE_QUOTES): unquoted "1"
        // would load
        // as a number, "y" as a boolean, and "=" is a reserved YAML 1.1 tag.
        return YAMLMapper.builder().disable(YAMLWriteFeature.WRITE_DOC_START_MARKER).build();
    }


    private Map<String, Object> generate() {
        Map<String, Object> document = new LinkedHashMap<>();

        List<Map.Entry<UnicodeRange, Collection<CharacterMappingRecord>>> sortedEntries = new ArrayList<>(
                data.entrySet());
        sortedEntries.sort(Map.Entry.comparingByKey());

        for (Map.Entry<UnicodeRange, Collection<CharacterMappingRecord>> entry : sortedEntries) {
            List<Map<String, String>> mappings = new ArrayList<>();

            for (CharacterMappingRecord record : entry.getValue()) {
                try {
                    UnicodeRange.fromCodePoint(record.getFrom());
                } catch (IllegalArgumentException exception) {
                    LOG.log(Level.WARNING, exception, () -> "Skipping code point outside of any unicode range: "
                            + String.format(ID_FORMAT, record.getFrom()));

                    continue;
                }

                Map<String, String> mapping = new LinkedHashMap<>();
                mapping.put(ID_KEY, record.getFromCodePoints());
                mapping.put(FROM_KEY, new String(Character.toChars(record.getFrom())));
                mapping.put(TO_KEY, record.getTo().toString());

                mappings.add(mapping);
            }

            document.put(entry.getKey().getAlias(), mappings);
        }

        return document;
    }


    public final void generate(OutputStream out) throws IOException {
        setup().writerWithDefaultPrettyPrinter().writeValue(out, generate());
    }


    public final void generate(Path path) throws IOException {
        try (OutputStream out = Files.newOutputStream(path)) {
            generate(out);
        }
    }


    public final void generate(String path) throws IOException {
        generate(Path.of(path));
    }
}
