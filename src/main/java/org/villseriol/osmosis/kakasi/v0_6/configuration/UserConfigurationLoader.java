// This software is released into the Public Domain.  See copying.txt for details.
package org.villseriol.osmosis.kakasi.v0_6.configuration;

import java.io.File;

import org.openstreetmap.osmosis.core.OsmosisRuntimeException;
import org.villseriol.osmosis.kakasi.v0_6.configuration.model.UserConfiguration;

import com.fasterxml.jackson.annotation.JsonAutoDetect;

import tools.jackson.databind.DeserializationFeature;
import tools.jackson.dataformat.xml.XmlMapper;


public final class UserConfigurationLoader {
    private static UserConfigurationLoader instance;

    private UserConfigurationLoader() {
        super();
    }


    public static UserConfigurationLoader getInstance() {
        if (instance == null) {
            instance = new UserConfigurationLoader();
        }

        return instance;
    }


    public UserConfiguration load(File configFile) {
        try {
            XmlMapper mapper = XmlMapper.builder()
                    .changeDefaultVisibility(vc -> vc.withFieldVisibility(JsonAutoDetect.Visibility.ANY)
                            .withGetterVisibility(JsonAutoDetect.Visibility.NONE)
                            .withSetterVisibility(JsonAutoDetect.Visibility.NONE)
                            .withIsGetterVisibility(JsonAutoDetect.Visibility.NONE))
                    .disable(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES).build();

            UserConfiguration config = mapper.readValue(configFile, UserConfiguration.class);

            return config;
        } catch (OsmosisRuntimeException e) {
            throw e;
        } catch (Exception e) {
            throw new OsmosisRuntimeException("Failed to load user configuration", e);
        }
    }


    public UserConfiguration load(String configFile) {
        File file = new File(configFile);
        return load(file);
    }
}
