// This software is released into the Public Domain.  See copying.txt for details.
package org.villseriol.osmosis.kakasi;

import java.util.HashMap;
import java.util.Map;

import org.openstreetmap.osmosis.core.pipeline.common.TaskManagerFactory;
import org.openstreetmap.osmosis.core.plugin.PluginLoader;
import org.villseriol.osmosis.kakasi.v0_6.KakasiTaskFactory;


public class KakasiPlugin implements PluginLoader {
    @Override
    public Map<String, TaskManagerFactory> loadTaskFactories() {
        KakasiTaskFactory transformFactory = new org.villseriol.osmosis.kakasi.v0_6.KakasiTaskFactory();

        Map<String, TaskManagerFactory> tasks = new HashMap<String, TaskManagerFactory>();
        tasks.put("kakasi", transformFactory);
        tasks.put("kakasi-0.6", transformFactory);

        return tasks;
    }
}
