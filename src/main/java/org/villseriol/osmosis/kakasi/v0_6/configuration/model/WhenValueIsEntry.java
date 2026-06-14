// This software is released into the Public Domain.  See copying.txt for details.
package org.villseriol.osmosis.kakasi.v0_6.configuration.model;

import tools.jackson.dataformat.xml.annotation.JacksonXmlProperty;


public class WhenValueIsEntry {
    @JacksonXmlProperty(isAttribute = true, localName = "value")
    private String value;

    public WhenValueIsEntry() {
        super();
    }


    public String getValue() {
        return value;
    }


    public void setValue(String value) {
        this.value = value;
    }
}
