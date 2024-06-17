package com.yunya.pointservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.context.config.annotation.RefreshScope;

@SpringBootApplication
public class PointServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(PointServiceApplication.class, args);
    }

}
