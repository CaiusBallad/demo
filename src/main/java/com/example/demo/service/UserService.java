package com.example.demo.service;

import com.example.demo.bean.User;
import com.example.demo.dao.UserDao;
import com.example.demo.dao.UserXMLDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class UserService {
    @Autowired
    private UserDao userDao;

    @Autowired
    private UserXMLDao userXMLDao;

    public User selectUserById(Integer id){
        return userXMLDao.findUserById(id);
    }

    public List<User> selectAllUser(){
        return userDao.findAllUser();
    }

    public void insertUser(){
        userDao.insertUser("ZhangSan","123",new Date());
        userDao.insertUser("WangWu","321",new Date());
    }

    public void deleteUser(Integer id){
        userDao.deleteUserById(id);
    }

    public void changePassword(){
        userDao.updateUser("333", 4);
    }
}
