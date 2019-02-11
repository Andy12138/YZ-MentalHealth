package com.yz_mentalhealth.login.service.impl;

import com.yz_mentalhealth.login.dao.LoginMapper;
import com.yz_mentalhealth.login.service.LoginService;
import com.yz_mentalhealth.user.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Transactional
@Service
public class LoginServiceImpl implements LoginService {

    @Autowired
    private LoginMapper loginMapper;

    @Override
    public boolean isLogin(User user) {
        int loginFlag = loginMapper.isLogin(user);

        if (loginFlag>0) {
            return true;
        }
        return false;
    }
}
