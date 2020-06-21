package com.shengsiyuan.feign.controller;

import com.shengsiyuan.feign.domain.Parent;
import com.shengsiyuan.feign.domain.Student;
import com.shengsiyuan.feign.service.MyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {

    @Autowired
    private MyService myService;


    @GetMapping("/infoByFeign")
    public String infoByFeign() {
        return this.myService.infoByFeign();
    }

    @GetMapping(value = "/getStudentByFeign", produces = "application/json;charset=UTF-8")
    public Student getStudentByFeign() {
        return this.myService.getStudentByFeign("zhangsan", "guangzhou");
    }

    @PostMapping(value = "/postStudentByFeign", produces = "application/json;charset=UTF-8")
    public Student postStudentByFeign() {
        Parent parent = new Parent();
        parent.setId(30);
        parent.setName("myName");
        parent.setAddress("myAddress");

        return this.myService.postStudentByFeign(parent);
    }
}
