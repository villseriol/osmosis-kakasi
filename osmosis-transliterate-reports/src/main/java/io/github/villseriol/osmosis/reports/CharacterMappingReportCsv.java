// This software is released into the Public Domain.  See copying.txt for details.
package io.github.villseriol.osmosis.reports;

import java.io.IOException;
import java.io.Writer;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;

import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVPrinter;
import org.apache.commons.csv.QuoteMode;
import io.github.villseriol.osmosis.transliterate.v0_6.unicode.UnicodeRange;


public class CharacterMappingReportCsv {
    private static final Logger LOG = Logger.getLogger(CharacterMappingReportCsv.class.getName());

    private static final String ID_FORMAT = "U+%04X";
    private static final String FILE_EXTENSION = ".csv";

    private static final String ID_KEY = "id";
    private static final String FROM_KEY = "from";
    private static final String TO_KEY = "to";

    private Map<UnicodeRange, Collection<CharacterMappingRecord>> data;

    public CharacterMappingReportCsv(Map<UnicodeRange, Collection<CharacterMappingRecord>> data) {
        this.data = data;
    }


    public Map<UnicodeRange, Collection<CharacterMappingRecord>> getData() {
        return data;
    }


    public void setData(Map<UnicodeRange, Collection<CharacterMappingRecord>> data) {
        this.data = data;
    }


    private CSVFormat setup() {
        // Every field is quoted so glyphs such as whitespace, quotes and
        // combining marks survive a round trip through spreadsheet tools.
        return CSVFormat.RFC4180.builder().setHeader(ID_KEY, FROM_KEY, TO_KEY).setQuoteMode(QuoteMode.ALL).get();
    }


    private void generate(CSVPrinter printer, Collection<CharacterMappingRecord> records) throws IOException {
        for (CharacterMappingRecord record : records) {
            try {
                UnicodeRange.fromCodePoint(record.getFrom());
            } catch (IllegalArgumentException exception) {
                LOG.log(Level.WARNING, exception, () -> "Skipping code point outside of any unicode range: "
                        + String.format(ID_FORMAT, record.getFrom()));

                continue;
            }

            printer.printRecord(record.getFromCodePoints(), new String(Character.toChars(record.getFrom())),
                    record.getTo().toString());
        }
    }


    /**
     * Writes one CSV file per unicode range into the given directory, named
     * after the range alias (e.g. {@code basic-latin.csv}).
     *
     * @param directory the directory to write the CSV files into; created if
     *        missing
     * @throws IOException if a file cannot be written
     */
    public final void generate(Path directory) throws IOException {
        Files.createDirectories(directory);

        List<Map.Entry<UnicodeRange, Collection<CharacterMappingRecord>>> sortedEntries = new ArrayList<>(
                data.entrySet());
        sortedEntries.sort(Map.Entry.comparingByKey());

        CSVFormat format = setup();

        for (Map.Entry<UnicodeRange, Collection<CharacterMappingRecord>> entry : sortedEntries) {
            Path path = directory.resolve(entry.getKey().getAlias() + FILE_EXTENSION);

            try (Writer writer = Files.newBufferedWriter(path, StandardCharsets.UTF_8);
                    CSVPrinter printer = new CSVPrinter(writer, format)) {
                generate(printer, entry.getValue());
            }
        }
    }


    public final void generate(String directory) throws IOException {
        generate(Path.of(directory));
    }
}
