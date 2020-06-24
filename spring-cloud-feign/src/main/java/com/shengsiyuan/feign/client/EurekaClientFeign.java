package com.shengsiyuan.feign.client;


import com.shengsiyuan.feign.client.config.FeignClientConfig;
import com.shengsiyuan.feign.client.config.FeignClientInterceptorConfig;
import com.shengsiyuan.feign.client.hystrix.EurekaClientFeignHystrix;
import com.shengsiyuan.feign.domain.Parent;
import com.shengsiyuan.feign.domain.Student;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(value = "eureka-client", configuration = {FeignClientConfig.class, FeignClientInterceptorConfig.class},fallback = EurekaClientFeignHystrix.class)
public interface EurekaClientFeign {

    @GetMapping(value = "/info")
    String infoByFeign();

    @GetMapping("/getStudent")
    Student getStudentByFeign(@RequestParam("name") String name, @RequestParam("address") String address);

    @PostMapping("/postStudent")
    Student postStudentByFeign(@RequestBody Parent parent);
}
