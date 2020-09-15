/**
 * Dana.id
 * Copyright (c) 2017-2020 All Rights Reserved.
 */
package com.github.ahisyfa.hellospring.javabased;

import org.springframework.stereotype.Component;

/**
 * @author Ahmad Isyfalana Amin
 * @version $Id: Dokar.java, v 0.1 2020-05-09  19.35 Ahmad Isyfalana Amin Exp $
 */
@Component
public class Dokar implements Vehicle {
    @Override
    public void run() {
        System.out.println("Krook krook");
    }
}