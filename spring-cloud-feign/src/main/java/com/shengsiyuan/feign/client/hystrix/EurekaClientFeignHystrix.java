package com.shengsiyuan.feign.client.hystrix;

import com.shengsiyuan.feign.client.EurekaClientFeign;
import com.shengsiyuan.feign.domain.Parent;
import com.shengsiyuan.feign.domain.Student;
import org.springframework.stereotype.Component;

@Component
public class EurekaClientFeignHystrix implements EurekaClientFeign {

    @Override
    public String infoByFeign() {
        return "This is Feign with Hystrix";
    }

    @Override
    public Student getStudentByFeign(String name, String address) {
        return null;
    }

    @Override
    public Student postStudentByFeign(Parent parent) {
        return null;
    }
}
