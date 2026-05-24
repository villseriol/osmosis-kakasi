// This software is released into the Public Domain.  See copying.txt for details.
package org.villseriol.osmosis.kakasi.v0_6.configuration.model;

import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonRootName;

import tools.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper;
import tools.jackson.dataformat.xml.annotation.JacksonXmlProperty;


@JsonRootName(value = "replace-with")
public class ReplaceWithEntry {
    @JacksonXmlProperty(isAttribute = true, localName = "value")
    private String value;

    @JacksonXmlElementWrapper(useWrapping = false)
    @JacksonXmlProperty(localName = "when-value-is")
    private List<WhenValueIsEntry> whenValues = new ArrayList<>();

    public ReplaceWithEntry() {
        super();
    }


    public String getValue() {
        return value;
    }


    public void setValue(String value) {
        this.value = value;
    }


    public List<WhenValueIsEntry> getWhenValues() {
        return whenValues;
    }


    public void setWhenValues(List<WhenValueIsEntry> whenValues) {
        this.whenValues = whenValues;
    }

}
