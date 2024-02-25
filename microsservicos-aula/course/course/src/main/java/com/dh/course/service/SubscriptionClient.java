package com.dh.course.service;

import org.springframework.cloud.loadbalancer.annotation.LoadBalancerClient;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient("subscription-service")
@LoadBalancerClient("subscription-service")
public interface SubscriptionClient {

    @GetMapping("/subscription/port")
    String getPort();
}
