package com.yz_mentalhealth.login.dao;

import com.yz_mentalhealth.user.entity.User;


public interface LoginMapper {

    /**
     * 登陆判断
     * @param user
     * @return
     */
    int isLogin(User user);
}
