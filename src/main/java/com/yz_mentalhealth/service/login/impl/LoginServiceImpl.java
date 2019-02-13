package com.yz_mentalhealth.service.login.impl;

import com.yz_mentalhealth.common.component.BaseServiceMybatisImpl;
import com.yz_mentalhealth.mapper.login.LoginMapper;
import com.yz_mentalhealth.service.login.LoginService;
import com.yz_mentalhealth.entity.user.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.servlet.http.HttpServletRequest;

@Transactional
@Service
public class LoginServiceImpl extends BaseServiceMybatisImpl implements LoginService {

    @Autowired
    private LoginMapper loginMapper;

    @Override
    public boolean isLogin(User user) {
        User loginUser = loginMapper.isLogin(user);
        //int loginFlag = this.getSqlSessionTemplate().selectOne("LoginMapper.isLogin",user);

        if (null!=loginUser) {
            HttpServletRequest request = ((ServletRequestAttributes)RequestContextHolder.getRequestAttributes()).getRequest();
            request.getSession().setAttribute("loginUser",loginUser);
            return true;
        }
        return false;
    }
}
