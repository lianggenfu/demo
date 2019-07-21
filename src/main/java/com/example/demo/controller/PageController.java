package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class PageController {

    @RequestMapping("/index")
    public String index(){
        return "index";
    }

    @RequestMapping("/vuedemo")
    public String vuedemo(){
        return "vuedemo";
    }

    @RequestMapping("/login")
    public String login(){
        return "login";
    }
    @RequestMapping("/login2")
    public String login2(){
        return "login2";
    }


    @RequestMapping("/register")
    public String register(){
        return "register";
    }


}
