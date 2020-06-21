package com.shengsiyuan.zuul.config;


import com.netflix.zuul.ZuulFilter;
import com.shengsiyuan.zuul.filter.MyZuulFilter;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MyZuulConfig {

    @Bean
    public ZuulFilter myZuulFilter() {
        return new MyZuulFilter();
    }
}
