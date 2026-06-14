// This software is released into the Public Domain.  See copying.txt for details.
package org.villseriol.osmosis.kakasi.v0_6.configuration.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonRootName;

import tools.jackson.dataformat.xml.annotation.JacksonXmlProperty;


@JsonRootName(value = "dictionary")
public class DictionaryEntry {
    @JacksonXmlProperty(isAttribute = true, localName = "path")
    private String path;

    @JacksonXmlProperty(isAttribute = true, localName = "alias")
    private String alias;

    @JsonCreator
    public DictionaryEntry(@JsonProperty("path") String path, @JsonProperty("alias") String alias) {
        boolean hasPath = path != null && !path.isEmpty();
        boolean hasAlias = alias != null && !alias.isEmpty();

        if (hasPath && hasAlias) {
            throw new IllegalArgumentException("Only one of 'path' or 'alias' may be specified for a dictionary entry");
        }
        if (!hasPath && !hasAlias) {
            throw new IllegalArgumentException("One of 'path' or 'alias' must be specified for a dictionary entry");
        }

        this.path = path;
        this.alias = alias;
    }


    public String getPath() {
        return path;
    }


    public void setPath(String path) {
        this.path = path;
    }


    public String getAlias() {
        return alias;
    }


    public void setAlias(String alias) {
        this.alias = alias;
    }
}
