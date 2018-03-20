package com.lenfu.service.user;

import com.lenfu.model.User;

import java.util.List;

/**
 * Created by Len Fu on 2018/1/7.
 */
public interface UserService {

    int addUser(User user);
    int deleteByPrimaryKey(int userId);
    List<User> findAllUser(int pageNum, int pageSize);
}
