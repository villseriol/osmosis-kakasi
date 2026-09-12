// This software is released into the Public Domain.  See copying.txt for details.
package io.github.villseriol.osmosis.reports;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

import io.github.villseriol.osmosis.reports.config.ReportFormat;
import io.github.villseriol.osmosis.reports.generator.CharacterMappingReportGenerator;


public final class GenerateOsmosisTransliterateReport {

    private GenerateOsmosisTransliterateReport() {
        super();
    }


    public static void main(String[] args) throws IOException {
        if (args.length != 3) {
            throw new IllegalArgumentException(
                    "Usage: GenerateOsmosisTransliterateReport <yaml|csv> <configFile> <outputFile|outputDirectory>");
        }

        ReportFormat format = ReportFormat.fromAlias(args[0]);
        Path configFile = Path.of(args[1]);
        Path output = Path.of(args[2]);

        Path outputDir = output.toAbsolutePath().getParent();
        if (outputDir != null) {
            Files.createDirectories(outputDir);
        }

        new CharacterMappingReportGenerator(format, configFile).generate(output);
    }
}
