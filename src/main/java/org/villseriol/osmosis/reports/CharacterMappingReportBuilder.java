// This software is released into the Public Domain.  See copying.txt for details.
package org.villseriol.osmosis.reports;

import java.io.IOException;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.villseriol.osmosis.transliterate.v0_6.unicode.UnicodeRange;
import org.villseriol.osmosis.transliterate.v0_6.unicode.Unimap;


public class CharacterMappingReportBuilder {
    private final Map<UnicodeRange, Collection<CharacterMappingRecord>> model = new HashMap<>();

    public void process(Unimap unimap) {
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
    }


    public Map<UnicodeRange, Collection<CharacterMappingRecord>> getModel() {
        return model;
    }


    public void generate(Path path) throws IOException {
        new CharacterMappingReportYaml(model).generate(path);
    }
}
