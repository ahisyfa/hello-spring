/**
 * Dana.id
 * Copyright (c) 2017-2020 All Rights Reserved.
 */
package com.github.ahisyfa.hellospring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author Ahmad Isyfalana Amin
 * @version $Id: Home.java, v 0.1 2020-01-06  11.10 Ahmad Isyfalana Amin Exp $
 */
@Controller
public class Home {

    @GetMapping("/")
    public String home() {

        return "home";
    }

}