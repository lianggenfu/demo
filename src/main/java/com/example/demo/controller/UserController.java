package com.example.demo.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.example.demo.model.User;
import com.example.demo.model.condition.UserSearchCondition;
import com.example.demo.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.List;

@Controller
public class UserController {

    @Reference
    private UserService userService;

    @RequestMapping("/userlogin")
    public String userlogin(String username, String password,HttpServletRequest request){
        User user = new User();
        user.setAccount(username);
        user.setPassword(password);

        UserSearchCondition condition = new UserSearchCondition();
        List<User> users = userService.findAll(condition).getResults();
        for(User userDb : users){
            if(userDb.getAccount().equals(username)) {
                if (userDb.getPassword().equals(password)) {
                    request.getSession().setAttribute("username",username);
                    return "index";
                }
            }
        }
        return "loginfaild";
    }

    @RequestMapping("/userlogout")
    public String userlogout(HttpServletRequest request){
        HttpSession session = request.getSession(false);
        if(session!=null){
            session.removeAttribute("username");
            session.invalidate();
        }
        return "login";
    }

    //userregister
    @PostMapping("/userregister")
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
        //return "login";
        return "index1";
    }
}
