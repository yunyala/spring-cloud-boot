package com.yunya.orderservice.controller;

import com.yunya.commonmodule.entity.Order;
import com.yunya.orderservice.feignClient.PointServiceFeignClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/order")
public class OrderController {

    @Autowired
    private PointServiceFeignClient pointServiceFeignClient;

    @GetMapping(value = "/test")
    public String test() {
        System.out.println("order-service orderController test function...");
        return "order-service orderController test function...";
    }

    @PostMapping("/addPoint")
    public String addPoint() {
        Order order = new Order();
        order.setId("1");
        order.setProductionName("Java进阶");
        String s = pointServiceFeignClient.addPoint(order);
        System.out.println("返回结果是：" + s);
        return s;
    }

    @PostMapping("/addPoint2")
    public String addPoint2() {
        String s = pointServiceFeignClient.addPoint2("Java进阶2");
        System.out.println("返回结果是：" + s);
        return s;
    }

}
