/**
 * Dana.id
 * Copyright (c) 2017-2020 All Rights Reserved.
 */
package com.github.ahisyfa.hellospring.ioc;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.core.Ordered;

/**
 * @author Ahmad Isyfalana Amin
 * @version $Id: InstantiationTracingBeanPostProcessor.java, v 0.1 2020-05-05  15.46 Ahmad Isyfalana Amin Exp $
 */
public class InstantiationTracingBeanPostProcessor implements BeanPostProcessor, Ordered {

    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        System.out.println("BPP::beforeInit() " + beanName);
        return bean;
    }

    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        System.out.println("BPP::afterInit() " + beanName);
        return bean;
    }

    @Override
    public int getOrder() {
        return 1;
    }
}