package com.yz_mentalhealth.service.user.impl;

import com.yz_mentalhealth.mapper.user.UserMapper;
import com.yz_mentalhealth.entity.user.User;
import com.yz_mentalhealth.service.user.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public void addUser(User newUser) {
        userMapper.addUser(newUser);
    }

    @Override
    public void updateUser(User newUser) {
        userMapper.updateUser(newUser);
    }

    @Override
    public List<User> getUserList() {
        return userMapper.getUserList();
    }

    @Override
    public User getUser(User user) {
        return userMapper.getUser(user);
    }

    @Override
    public void deleteUser(User user) {
        userMapper.deleteUser(user);
    }
}
