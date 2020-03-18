package com.example.demo.controller;

import com.example.demo.bean.User;
import com.example.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserService userService;


    @RequestMapping("/query")
    public User query(){
        return userService.selectUserById(1);
    }

    @RequestMapping("/insert")
    public List<User> insertUser(){
        String before ="Before: "+ userService.selectAllUser() + "]";
        System.out.println(before);
        userService.insertUser();
        return userService.selectAllUser();
    }

    @RequestMapping("/changePassword")
    public List<User> changerPassword(){
        userService.changePassword();
        return userService.selectAllUser();
    }

    @RequestMapping("delete")
    public List<User> testDelete(){
        userService.deleteUser(2);
        return userService.selectAllUser();
    }
}
