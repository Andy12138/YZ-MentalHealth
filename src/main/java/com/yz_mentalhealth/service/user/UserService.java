package com.yz_mentalhealth.service.user;

import com.yz_mentalhealth.entity.user.User;

import java.util.Collection;
import java.util.List;

public interface UserService {

    void addUser(User newUser);

    void updateUser(User user);

    List<User> getUserList();

    User getUser(User user);

    void deleteUser(User user);
}
