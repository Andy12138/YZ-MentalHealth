package com.yz_mentalhealth.mapper.login;

import com.yz_mentalhealth.entity.user.User;


public interface LoginMapper {

    /**
     * 登陆判断
     * @param user
     * @return
     */
    User isLogin(User user);
}
