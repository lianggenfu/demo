package com.example.demo.controller;

import com.example.demo.model.User;
import com.example.demo.model.UserSearchCondition;
import com.example.demo.service.UserService;
import com.example.demo.utils.ErrorException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping("/findById")
    public String findById(){
        return userService.findById(1).toString();
    }

    @RequestMapping("/userlogin")
    public String userlogin(String username,String password){
        User user = new User();
        user.setAccount(username);
        user.setPassword(password);

        UserSearchCondition condition = new UserSearchCondition();
        List<User> users = userService.findAll(condition).getResults();
        for(User userDb : users){
            if(userDb.getAccount().equals(username)) {
                if (userDb.getPassword().equals(password)) {
                    return "index";
                }
            }
        }
        return "loginfaild";
    }

    //userregister
    @RequestMapping("/userregister")
    public String userregister(String username,String password){
        User user = new User();
        user.setAccount(username);
        user.setPassword(password);

        UserSearchCondition condition = new UserSearchCondition();
        List<User> users = userService.findAll(condition).getResults();
        for(User userDb : users){
            if(userDb.getAccount().equals(username)){
                //throw new ErrorException("该用户名已存在");
                return "registerfaild";
            }
        }
        userService.createByBo(user);
        return "login";
    }
}
