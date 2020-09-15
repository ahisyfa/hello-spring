/**
 * Dana.id
 * Copyright (c) 2017-2020 All Rights Reserved.
 */
package com.github.ahisyfa.hellospring.javabased;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author Ahmad Isyfalana Amin
 * @version $Id: DemoJavaBasedContainer.java, v 0.1 2020-05-09  19.33 Ahmad Isyfalana Amin Exp $
 */
public class DemoJavaBasedContainer {

    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        Vehicle dokar = context.getBean("dokar", Dokar.class);
        dokar.run();


    }
}