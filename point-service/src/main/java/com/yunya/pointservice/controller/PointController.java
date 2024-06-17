package com.yunya.pointservice.controller;

import com.yunya.commonmodule.entity.Order;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.*;

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

    @PostMapping("/add")
    public String addPoint(@RequestBody Order order) {
        return "add point success!商品名称："+order.getProductionName();
    }

    @PostMapping("/add2")
    public String addPoint2(@RequestParam("productionName") String productionName) {
        return "add point success!商品名称222："+ productionName;
    }

}
