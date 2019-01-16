package com.yz_mentalhealth.user.service;

import com.yz_mentalhealth.user.entity.User;

import java.util.Collection;

public interface UserService {

    void save(User newUser);

    Collection<User> getAll();

    User get(Integer id);

    void delete(Integer id);
}
