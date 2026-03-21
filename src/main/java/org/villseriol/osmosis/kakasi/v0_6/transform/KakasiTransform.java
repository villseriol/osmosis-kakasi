// This software is released into the Public Domain.  See copying.txt for details.
package org.villseriol.osmosis.kakasi.v0_6.transform;

import org.villseriol.kakasi.api.Kakasi;


public class KakasiTransform implements Transform {
    private final Kakasi kakasi;

    public KakasiTransform() {
        super();
        this.kakasi = new Kakasi();
    }


    public KakasiTransform(Kakasi kakasi) {
        super();
        this.kakasi = kakasi;
    }


    public Kakasi getKakasi() {
        return kakasi;
    }


    @Override
    public String action(String input) {
        return kakasi.run(input);
    }
}
