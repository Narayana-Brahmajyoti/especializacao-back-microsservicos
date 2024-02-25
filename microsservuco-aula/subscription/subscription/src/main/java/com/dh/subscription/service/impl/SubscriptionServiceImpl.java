package com.dh.subscription.service.impl;

import com.dh.subscription.service.SubscriptionService;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class SubscriptionServiceImpl implements SubscriptionService{
    @Value("${server.port}")
    private String port;

    @Override
    public String getPort() {
        return this.port;
    }
}
