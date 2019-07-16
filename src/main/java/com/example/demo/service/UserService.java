package com.example.demo.service;

import com.example.demo.model.User;
import com.example.demo.model.UserSearchCondition;
import com.example.demo.utils.Page;

import java.util.List;

public interface UserService {

    User findById(int id);

    Page<User> findAll(UserSearchCondition condition);

    User createByBo(User user);

    User updateByBo(User user);

    void delete(User user);

}
