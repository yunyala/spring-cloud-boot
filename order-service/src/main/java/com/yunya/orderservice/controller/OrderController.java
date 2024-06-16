package com.yunya.orderservice.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/order")
public class OrderController {

    @GetMapping(value = "/test")
    public String test() {
        System.out.println("order-service orderController test function...");
        return "order-service orderController test function...";
    }

}
