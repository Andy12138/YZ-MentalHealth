package com.yz_mentalhealth.service.login;

import com.yz_mentalhealth.entity.user.User;

public interface LoginService {
    /**
     * 登陆判断
     * @param user
     * @return
     */
    boolean isLogin(User user);
}
