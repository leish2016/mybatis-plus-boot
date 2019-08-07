package com.lsh.mybatisplus.boot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.TimeZone;

/**
 * @author leish
 */
@SpringBootApplication
public class StartApp {
    public static void main(String[] args) {
        //设置默认时区
        TimeZone.setDefault(TimeZone.getTimeZone("GMT+8"));
        SpringApplication.run(StartApp.class, args);
    }
}
