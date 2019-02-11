package com.yz_mentalhealth.login.service;

import com.yz_mentalhealth.user.entity.User;

public interface LoginService {
    /**
     * 登陆判断
     * @param user
     * @return
     */
    boolean isLogin(User user);
}
