package com.example.demo.controller;

import com.example.demo.model.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

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

}
