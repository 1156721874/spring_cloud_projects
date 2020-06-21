package com.shengsiyuan.ribbon.service.impl;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.shengsiyuan.ribbon.service.RibbonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class RibbonServiceImpl implements RibbonService {

    @Autowired
    private RestTemplate restTemplate;


    @Override
    @HystrixCommand(fallbackMethod = "errorHandler")
    public String info() {
        return this.restTemplate.getForObject("http://eureka-client/info", String.class);
    }


    @Override
    public String errorHandler() {
        return "Server Error";
    }
}
