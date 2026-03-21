// This software is released into the Public Domain.  See copying.txt for details.
package org.villseriol.osmosis.kakasi.v0_6;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;
import org.openstreetmap.osmosis.testutil.AbstractDataTest;


public class KakasiPipelineTest extends AbstractDataTest {
    private final KakasiPipeline pipeline = new KakasiPipeline();

    @Before
    public void setUp() {
        pipeline.init();
    }


    @Test
    public void testSplitter() {
        assertEquals("EY4180 (kabu)", pipeline.run("EY4180 (株)"));
        assertEquals("EY4180 (kabu)", pipeline.run("EY4180 (株)"));
        assertEquals("EY4180 )((kabu())", pipeline.run("EY4180 )((株())"));
        assertEquals("EY>4180 )((kabu())", pipeline.run("EY>4180 )((株())"));
        assertEquals("ka a . ga^den", pipeline.run("珈亜・ガーデン"));
    }
}
