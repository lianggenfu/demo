package com.example.demo.controller;

import com.example.demo.utils.MyHttpSessionListener;
import com.example.demo.utils.WebIdCount;
import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.HttpRequestHandler;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpSession;
import javax.servlet.http.HttpSessionEvent;

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

    @RequestMapping("/register")
    public String register(){
        return "register";
    }

    @RequestMapping("/session")
    public String session(HttpSession session){

        session.setAttribute("num",12);
        return "login";
    }

}
