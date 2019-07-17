package com.example.demo.controller;

import com.example.demo.model.User;
import com.example.demo.model.UserSearchCondition;
import com.example.demo.service.UserService;
import com.example.demo.utils.ErrorException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
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
            if(userDb.getAccount().equals(username)){
                if(userDb.getPassword().equals(password)){
                    return "index";
                }else {
                    throw new ErrorException("用户密码错误");
                }
            }else {
                throw new ErrorException("该用户不存在");
            }
        }
        return "loginfaild";
    }
}
