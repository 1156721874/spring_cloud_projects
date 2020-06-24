package com.shengsiyuan.config.client.controller;


import com.shengsiyuan.config.client.config.ConfigClientConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class  MyController {

    @Autowired
    private ConfigClientConfig configClientConfig;


    @RequestMapping(value = "/hosts")
    public String getHosts() {
        return configClientConfig.getRedisHost() + ", " +
                configClientConfig.getMysqlHost() + ", " +
                configClientConfig.getMongoHost();
    }
}
