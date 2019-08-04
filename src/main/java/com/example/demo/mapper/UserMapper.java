package com.example.demo.mapper;

import com.example.demo.model.User;
import com.example.demo.model.condition.UserSearchCondition;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;


@Mapper
public interface UserMapper {

    User findById(int id);

    List<User> searchList(UserSearchCondition condition);

    int searchCount(UserSearchCondition condition);

    int createByBo(User user);

    int updateByBo(User user);

    void delete(User user);
}
