package com.yunya.orderservice.feignClient;

import com.yunya.commonmodule.entity.Order;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(value = "point-service")
public interface PointServiceFeignClient {

    @PostMapping("/point/add")
    String addPoint(@RequestBody Order order);

    @PostMapping("/point/add2")
    String addPoint2(@RequestParam("productionName") String productionName);

}
