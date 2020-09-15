/**
 * Dana.id
 * Copyright (c) 2017-2020 All Rights Reserved.
 */
package com.github.ahisyfa.hellospring.ioc;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

/**
 * @author Ahmad Isyfalana Amin
 * @version $Id: Gendang.java, v 0.1 2020-03-28  00.57 Ahmad Isyfalana Amin Exp $
 */
public class Gendang implements Instrument, InitializingBean, DisposableBean {
    @Override
    public String play() {
        return "Pang ketipang tipung";
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("InitializingBean:: Gendang after ini");
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("DisposableBean:: Gendang destroy");
    }
}