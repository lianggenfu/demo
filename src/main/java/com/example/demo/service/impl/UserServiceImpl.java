package com.example.demo.service.impl;

import com.example.demo.mapper.UserMapper;
import com.example.demo.model.User;
import com.example.demo.model.UserSearchCondition;
import com.example.demo.service.UserService;
import com.example.demo.utils.ErrorException;
import com.example.demo.utils.Page;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import javax.annotation.Resource;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    //@Cacheable(value = "common")
    public User findById(int id) {
        return userMapper.findById(id);
    }

    @Override
    public Page<User> findAll(UserSearchCondition condition) {
        Page<User> userPage = new Page<>();
        userPage.setResults(userMapper.searchList(condition));
        userPage.setTotal(userMapper.searchCount(condition));
        return userPage;
    }

    @Override
    public User createByBo(User user) {
        userMapper.createByBo(user);
        return user;
    }

    @Override
    public User updateByBo(User user) {
        User userDb = userMapper.findById(user.getId());
        if(StringUtils.isEmpty(userDb)){
            throw new ErrorException("改用户不存在！");
        }
        userMapper.updateByBo(user);
        return user;
    }

    @Override
    public void delete(User user) {
        User userDb = userMapper.findById(user.getId());
        if(userDb==null){
            throw new ErrorException("该用户不存在！");
        }
        userMapper.delete(user);
    }
}
