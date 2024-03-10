package com.yunshang.oa;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author: qhy
 * @date: 2024-03-10 14:48
 * @description: 主启动类
 */
@SpringBootApplication
@MapperScan("com.yunshang.oa.mapper")
public class YunshangOaApplication {

    public static void main(String[] args) {
        SpringApplication.run(YunshangOaApplication.class,args);
    }
}
