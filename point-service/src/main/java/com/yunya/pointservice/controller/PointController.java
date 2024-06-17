package com.yunya.pointservice.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/point")
@RefreshScope
public class PointController {

    @Value("${config.info}")
    private String configInfo;

    @GetMapping(value = "/test")
    public String test() {
        System.out.println("point-service PointController test function...");
        return "point-service PointController test function...";
    }

    @GetMapping(value = "/testGetConfigInfo")
    public String testGetConfigInfo() {
        System.out.println("testGetConfigInfo function...");
        return "testGetConfigInfo function...{}" + configInfo;
    }

}
