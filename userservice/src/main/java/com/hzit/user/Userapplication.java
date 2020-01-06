package com.hzit.user;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import tk.mybatis.spring.annotation.MapperScan;
@EnableDiscoveryClient
@SpringBootApplication
@MapperScan("com.hzit.user.mapper")
public class Userapplication {
    public static void main(String[] args) {
        SpringApplication.run(Userapplication.class);
    }
}
