package com.github.ahisyfa.hellospring.ioc;

/**
 * @author Ahmad Isyfalana Amin
 * @version $Id: Guitar.java, v 0.1 2020-03-28  00.28 Ahmad Isyfalana Amin Exp $
 */
public class Guitar implements Instrument {

    @Override
    public String play() {
        return "Jreeeeng jreng...";
    }

}