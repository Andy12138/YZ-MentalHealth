package com.yz_mentalhealth;

import com.yz_mentalhealth.common.component.RedisUtil;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.UUID;

@RunWith(SpringRunner.class)
@SpringBootTest
public class YzMentalhealthApplicationTests {

    @Autowired
    DataSource dataSource;

    @Autowired
    private RedisUtil redisUtil;

    @Test
    public void contextLoads() throws SQLException {
        System.out.println("钟名桂："+dataSource.getClass());

        Connection connection = dataSource.getConnection();
        System.out.println("钟名桂连接池："+connection);
        System.out.println("哈哈"+UUID.randomUUID().toString());
        connection.close();
    }

    @Test
    public void redisTest(){
        redisUtil.set("zmg","钟名桂",10000);
        System.out.println(redisUtil.get("zmg"));
    }

}

