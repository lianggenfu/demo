package com.example.demo.service;

import com.example.demo.model.User;
import com.example.demo.model.condition.UserSearchCondition;
import com.example.demo.utils.Page;


public interface UserService {

    /**
     * 通过用户id查找用户
     * @param id
     * @return User
     */
    User findById(int id);

    /**
     * 通过搜索条件查询满足条件得所以用户
     * @param condition
     * @return Page<User>
     */
    Page<User> findAll(UserSearchCondition condition);

    /**
     * 创建用户对象
     * @param user
     * @return user
     */
    User createByBo(User user);

    /**
     * 更新用户信息
     * @param user
     * @return
     */
    User updateByBo(User user);

    /**
     * 删除用户
     * @param user
     */
    void delete(User user);

}
