/**
 * Dana.id
 * Copyright (c) 2017-2020 All Rights Reserved.
 */
package com.github.ahisyfa.hellospring.ioc;

import org.springframework.stereotype.Component;

/**
 * @author Ahmad Isyfalana Amin
 * @version $Id: Car.java, v 0.1 2020-05-09  17.09 Ahmad Isyfalana Amin Exp $
 */
@Component
public class Car {

    public void run() {
        System.out.println("Breeem");
    }
}