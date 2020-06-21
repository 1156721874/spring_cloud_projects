package com.shengsiyuan.feign.client.config;


import feign.RequestInterceptor;
import feign.RequestTemplate;
import org.springframework.context.annotation.Configuration;

@Configuration
public class FeignClientInterceptorConfig implements RequestInterceptor {


    @Override
    public void apply(RequestTemplate template) {
        System.out.println("feign interceptor entered");

        template.header("authKey", "myKeyInfo");
    }
}
