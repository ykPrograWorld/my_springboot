package com.kai.service.impl;

import com.kai.entity.User;
import com.kai.mapper.UserMapper;
import com.kai.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Author: kai
 * @Date: Created in 下午 10:20 2018/11/16
 */
@Service
public class UserServiceImpl implements UserService {

//    注入mapper
    @Autowired
    private UserMapper userMapper;

    @Override
    public User getUserById(Integer id) {
        User user = userMapper.getUserById(id);
        return user;
    }
}
