package com.shengsiyuan.feign.service;


import com.shengsiyuan.feign.domain.Parent;
import com.shengsiyuan.feign.domain.Student;

public interface MyService {

    String infoByFeign();

    Student getStudentByFeign(String name, String address);

    Student postStudentByFeign(Parent parent);
}
