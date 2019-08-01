package com.yzb;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@SpringBootApplication
//@EnableWebMvc
@MapperScan("com.yzb.mapper") //扫描的mapper
public class TempleApplication {

    public static void main(String[] args) {
        SpringApplication.run(TempleApplication.class, args);
    }

}
