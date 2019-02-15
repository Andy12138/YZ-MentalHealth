package com.yz_mentalhealth.service.user.impl;

import com.yz_mentalhealth.mapper.user.UserMapper;
import com.yz_mentalhealth.entity.user.User;
import com.yz_mentalhealth.service.user.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import java.util.List;
import java.util.UUID;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public void addUser(User newUser) {
        newUser.setId(UUID.randomUUID().toString());
        newUser.setCjr(((User)((ServletRequestAttributes)RequestContextHolder.getRequestAttributes()).getRequest().getSession().getAttribute("loginUser")).getId());
        userMapper.addUser(newUser);
    }

    @Override
    public void updateUser(User newUser) {
        newUser.setXgr(((User)((ServletRequestAttributes)RequestContextHolder.getRequestAttributes()).getRequest().getSession().getAttribute("loginUser")).getId());
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
