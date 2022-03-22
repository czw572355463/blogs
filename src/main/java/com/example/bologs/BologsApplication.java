package com.example.bologs;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ComponentScans;

import java.util.Arrays;
import java.util.HashMap;

@SpringBootApplication
@MapperScan("com.example.bologs.dao")
public class BologsApplication {
    public static void main(String[] args) {
        SpringApplication.run(BologsApplication.class, args);
    }
}
