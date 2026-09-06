// This software is released into the Public Domain.  See copying.txt for details.
package org.villseriol.osmosis.reports;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.util.Collection;
import java.util.Map;

import org.junit.Test;
import org.villseriol.osmosis.transliterate.v0_6.unicode.UnicodeRange;
import org.villseriol.osmosis.transliterate.v0_6.unicode.Unimap;


public class CharacterMappingReportBuilderTest {
    private static final Unimap SINGLE_CHARACTER_REMAP = new Unimap() {
        @Override
        public String action(String input) {
            if ("a".equals(input)) {
                return "b";
            }

            return input;
        }


        @Override
        public void action(StringBuffer input) {
        }
    };

    @Test
    public void testProcessGroupsEveryRangeCharacterByUnicodeRange() {
        CharacterMappingReportBuilder builder = new CharacterMappingReportBuilder();
        builder.process(SINGLE_CHARACTER_REMAP);

        Map<UnicodeRange, Collection<CharacterMappingRecord>> data = builder.getModel();

        assertTrue(data.containsKey(UnicodeRange.BASIC_LATIN));
        int basicLatinSize = UnicodeRange.BASIC_LATIN.getUpper() - UnicodeRange.BASIC_LATIN.getLower() + 1;
        assertEquals(basicLatinSize, data.get(UnicodeRange.BASIC_LATIN).size());
    }


    @Test
    public void testProcessRecordsFromAndToForRemappedCharacter() {
        CharacterMappingReportBuilder builder = new CharacterMappingReportBuilder();
        builder.process(SINGLE_CHARACTER_REMAP);

        CharacterMappingRecord record = findRecordFor(builder, 'a');

        assertEquals(Integer.valueOf('a'), record.getFrom());
        assertEquals("b", record.getTo());
    }


    @Test
    public void testProcessRecordsFromAndToForUnchangedCharacter() {
        CharacterMappingReportBuilder builder = new CharacterMappingReportBuilder();
        builder.process(SINGLE_CHARACTER_REMAP);

        CharacterMappingRecord record = findRecordFor(builder, 'c');

        assertEquals(Integer.valueOf('c'), record.getFrom());
        assertEquals("c", record.getTo());
    }


    private CharacterMappingRecord findRecordFor(CharacterMappingReportBuilder builder, char from) {
        return builder.getModel().get(UnicodeRange.BASIC_LATIN).stream().filter(record -> record.getFrom() == from)
                .findFirst().orElseThrow();
    }
}
