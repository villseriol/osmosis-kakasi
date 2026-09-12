// This software is released into the Public Domain.  See copying.txt for details.
package io.github.villseriol.osmosis.transliterate.v0_6.unicode.decorator;

import io.github.villseriol.osmosis.transliterate.v0_6.unicode.Unimap;
import io.github.villseriol.osmosis.transliterate.v0_6.unicode.mapping.nonspecific.NoTransform;


public class ProxyDecorator implements Unimap {
    private Unimap proxy = new NoTransform();

    @Override
    public String action(String input) {
        return proxy.action(input);
    }


    @Override
    public void action(StringBuffer input) {
        proxy.action(input);
    }


    public Unimap getProxy() {
        return proxy;
    }


    public void setProxy(Unimap proxy) {
        this.proxy = proxy;
    }

}
