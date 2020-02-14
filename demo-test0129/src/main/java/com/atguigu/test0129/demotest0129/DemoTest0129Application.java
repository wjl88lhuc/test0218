package com.atguigu.test0129.demotest0129;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import tk.mybatis.spring.annotation.MapperScan;

@SpringBootApplication
@MapperScan(basePackages = "com.atguigu.test0129.demotest0129.mapper")
public class DemoTest0129Application {

    public static void main(String[] args) {
        SpringApplication.run(DemoTest0129Application.class, args);
    }

}
