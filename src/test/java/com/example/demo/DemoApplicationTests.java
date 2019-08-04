package com.example.demo;

import com.example.demo.model.User;
import com.example.demo.model.condition.UserSearchCondition;
import com.example.demo.service.UserService;
import com.example.demo.utils.Page;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class DemoApplicationTests {

    @Autowired
    private UserService userService;

    @Test
    public void contextLoads() {
        User user = userService.findById(1);
        System.out.println(user);
    }

    @Test
    public void createByBo() {
        User user = new User();
        //user.setId(2);
        user.setName("张牙");
        user.setAge(19);
        user.setSex("男");
        user.setComment("sd");
        User newUser = userService.createByBo(user);
        System.out.println(newUser);
    }

    @Test
    public void updateByBo() {
        User user = new User();
        user.setId(2);
        user.setName("张牙");
        user.setAge(78);
        user.setSex("男");
        user.setComment("update");
        User newUser = userService.updateByBo(user);
        System.out.println(newUser);
    }

    @Test
    public void delete() {
        User user = new User();
        user.setId(7);
        userService.delete(user);
    }

    @Test
    public void findAll(){
        UserSearchCondition condition = new UserSearchCondition();
        condition.setSearchText("丽");
        Page<User> rs = userService.findAll(condition);
        System.out.println(rs.getTotal());
    }

}
