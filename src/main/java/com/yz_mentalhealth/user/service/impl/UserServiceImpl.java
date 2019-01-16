package com.yz_mentalhealth.user.service.impl;

import com.yz_mentalhealth.user.dao.UserDao;
import com.yz_mentalhealth.user.entity.User;
import com.yz_mentalhealth.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;

    @Override
    public void save(User newUser) {
        userDao.save(newUser);
    }

    @Override
    public Collection<User> getAll() {
        return userDao.getAll();
    }

    @Override
    public User get(Integer id) {
        return userDao.get(id);
    }

    @Override
    public void delete(Integer id) {
        userDao.delete(id);
    }
}
