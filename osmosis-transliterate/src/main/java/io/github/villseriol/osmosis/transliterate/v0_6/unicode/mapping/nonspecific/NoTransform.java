// This software is released into the Public Domain.  See copying.txt for details.
package io.github.villseriol.osmosis.transliterate.v0_6.unicode.mapping.nonspecific;

import io.github.villseriol.osmosis.transliterate.v0_6.unicode.Unimap;


public class NoTransform implements Unimap {

    @Override
    public String action(String input) {
        return input;
    }


    @Override
    public void action(StringBuffer input) {
    }

}
