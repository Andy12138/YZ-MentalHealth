package com.yz_mentalhealth.common.component;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class BaseServiceMybatisImpl {

    @Autowired
    private SqlSessionTemplate sqlSessionTemplate;

    public SqlSessionTemplate getSqlSessionTemplate(){
        return this.sqlSessionTemplate;
    }
}
