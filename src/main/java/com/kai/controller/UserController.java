package com.kai.controller;

import com.kai.service.UserService;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: kai
 * @Date: Created in 下午 10:25 2018/11/16
 */
@RestController
public class UserController {
//    注入service
    @Autowired
    private UserService userService;

    @RequestMapping("/getuser")
    public Object getUser(Integer id){
        return userService.getUserById(id);
    }
}
