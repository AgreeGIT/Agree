package com.springboot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("agree/api")
public class indexController {

    @RequestMapping(value = "index")
    public String index(){
        return "index";
    }

}