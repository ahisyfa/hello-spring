package com.github.ahisyfa.hellospring.ioc;

/**
 * @author Ahmad Isyfalana Amin
 * @version $Id: Piano.java, v 0.1 2020-03-28  00.32 Ahmad Isyfalana Amin Exp $
 */
public class Piano implements Instrument {

    @Override
    public String play() {
        return "Ting ting tiing";
    }
}