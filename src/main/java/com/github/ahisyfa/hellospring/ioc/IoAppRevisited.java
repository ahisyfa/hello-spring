/**
 * Dana.id
 * Copyright (c) 2017-2020 All Rights Reserved.
 */
package com.github.ahisyfa.hellospring.ioc;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.GenericApplicationContext;

/**
 * @author Ahmad Isyfalana Amin
 * @version $Id: IoAppRevisited.java, v 0.1 2020-03-28  01.51 Ahmad Isyfalana Amin Exp $
 */
@Configuration
@ComponentScan(basePackages = "com.github.ahisyfa.hellospring.ioc")
public class IoAppRevisited {

    public static void main(String[] args) {
//        createContainer1();
//        createContainer2();
        createBeansAnnotated();
    }

    private static void createContainer1() {
        // 1. Load Spring configuration file
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext.xml");

        // 2. Ambil bean dari Spring Configuration
        Instrument i = context.getBean("gendang", Gendang.class);

        // 3. Panggil method
        System.out.println(i.play());

        // 4. close context
        context.close();

        System.out.println("");
        System.out.println("");
    }

    private static void createContainer2() {
        // 1. Load Spring configuration file
        GenericApplicationContext context = new GenericApplicationContext();
        new XmlBeanDefinitionReader(context)
                .loadBeanDefinitions("applicationContext.xml");
        context.refresh();

        // 2. Ambil bean dari Spring Configuration
        Instrument i = context.getBean("gendangDut", Gendang.class);

        // 3. Panggil method
        System.out.println(i.play());

        // 4. close context
        context.close();
    }

    private static void createBeansAnnotated() {
        // 1. Load Spring configuration file
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext.xml");

        // 2. Ambil bean dari Spring Configuration
        Car car = context.getBean("car", Car.class);

        // 3. Panggil method
        car.run();

        // 4. close context
        context.close();

        System.out.println("");
        System.out.println("");
    }

}