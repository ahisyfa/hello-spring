/**
 * Dana.id
 * Copyright (c) 2017-2020 All Rights Reserved.
 */
package com.github.ahisyfa.hellospring.javabased;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * @author Ahmad Isyfalana Amin
 * @version $Id: AppConfig.java, v 0.1 2020-05-09  17.10 Ahmad Isyfalana Amin Exp $
 */
@Configuration
@ComponentScan(basePackages = "com.github.ahisyfa.hellospring.javabased")
public class AppConfig {

    @Bean
    @Qualifier("dokarini")
    public Vehicle dokar() {
        return new Dokar();
    }

    @Bean
    public Vehicle dokarku(){
        return new Dokar();
    }

}