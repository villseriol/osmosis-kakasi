// This software is released into the Public Domain.  See copying.txt for details.
package io.github.villseriol.osmosis.reports.config;

public enum ReportFormat {
    /**
     * TODO.
     */
    YAML("yaml"),
    /**
     * TODO.
     */
    CSV("csv");

    private final String alias;

    ReportFormat(String alias) {
        this.alias = alias;
    }


    public String getAlias() {
        return alias;
    }


    public static ReportFormat fromAlias(String alias) {
        for (ReportFormat value : values()) {
            if (value.alias.equals(alias)) {
                return value;
            }
        }

        throw new IllegalArgumentException("Unknown report format: " + alias);
    }
}
