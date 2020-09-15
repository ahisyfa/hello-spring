/**
 * Dana.id
 * Copyright (c) 2017-2020 All Rights Reserved.
 */
package com.github.ahisyfa.hellospring.ioc;

/**
 * @author Ahmad Isyfalana Amin
 * @version $Id: IocDemo.java, v 0.1 2020-03-28  00.28 Ahmad Isyfalana Amin Exp $
 */
public class IocApp {

    public static void main(String[] args) {
        Instrument instrument = new Guitar();

        System.out.println(instrument.play());
    }

}