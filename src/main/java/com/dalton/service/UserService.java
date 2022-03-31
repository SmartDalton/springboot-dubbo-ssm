package com.dalton.service;

import com.dalton.dao.User;
import com.dalton.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



@Service
public class UserService {
    @Autowired
    UserMapper userMapper;

    public User Sel(int id) {
        return userMapper.Sel(id);
    }
    public void insert(User user){

        userMapper.insert(user);
    }
}