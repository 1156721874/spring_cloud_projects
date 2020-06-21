package com.shengsiyuan.feign.service.impl;

import com.shengsiyuan.feign.client.EurekaClientFeign;
import com.shengsiyuan.feign.domain.Parent;
import com.shengsiyuan.feign.domain.Student;
import com.shengsiyuan.feign.service.MyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MyServiceImpl implements MyService {

    @Autowired
    private EurekaClientFeign eurekaClientFeign;

    @Override
    public String infoByFeign() {
        return this.eurekaClientFeign.infoByFeign();
    }

    @Override
    public Student getStudentByFeign(String name, String address) {
        return this.eurekaClientFeign.getStudentByFeign(name, address);
    }

    @Override
    public Student postStudentByFeign(Parent parent) {
        return this.eurekaClientFeign.postStudentByFeign(parent);
    }
}
