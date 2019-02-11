package com.yz_mentalhealth;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan(value = "com.yz_mentalhealth.*.dao")
public class YzMentalhealthApplication {

    public static void main(String[] args) {
        SpringApplication.run(YzMentalhealthApplication.class, args);
    }

}

