package com.yz_mentalhealth.mapper.user;

import com.yz_mentalhealth.entity.user.User;

import java.util.List;

public interface UserMapper {

    void addUser(User newUser);

    void updateUser(User user);

    List<User> getUserList();

    User getUser(User user);

    void deleteUser(User user);
}
