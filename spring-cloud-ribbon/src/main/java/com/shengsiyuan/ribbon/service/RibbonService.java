package com.shengsiyuan.ribbon.service;

import org.springframework.stereotype.Service;

@Service
public interface RibbonService {

    String info();

    String errorHandler();
}
