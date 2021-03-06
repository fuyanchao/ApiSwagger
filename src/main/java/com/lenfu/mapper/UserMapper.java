package com.lenfu.mapper;

import com.lenfu.model.User;

import java.util.List;

public interface UserMapper {
    int deleteByPrimaryKey(int userId);

    int insert(User record);

    int insertSelective(User record);

    User selectByPrimaryKey(Integer userId);

    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);

    List<User> selectAllUser();
}