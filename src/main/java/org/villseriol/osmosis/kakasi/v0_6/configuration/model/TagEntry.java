// This software is released into the Public Domain.  See copying.txt for details.
package org.villseriol.osmosis.kakasi.v0_6.configuration.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonRootName;

import tools.jackson.dataformat.xml.annotation.JacksonXmlProperty;


@JsonRootName(value = "tag")
public class TagEntry {
    @JacksonXmlProperty(isAttribute = true, localName = "key")
    private final String key;

    @JsonCreator
    public TagEntry(@JsonProperty("key") String key) {
        if (key == null || key.isBlank()) {
            throw new IllegalArgumentException("Tag 'key' must not be empty or whitespace");
        }

        this.key = key;
    }


    public String getKey() {
        return key;
    }
}
