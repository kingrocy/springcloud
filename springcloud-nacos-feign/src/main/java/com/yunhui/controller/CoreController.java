package com.yunhui.controller;

import com.yunhui.service.FeignService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Date : 2020/6/9 5:07 下午
 * @Author : dushaoyun
 */
@RestController
public class CoreController {

    @Autowired
    FeignService feignService;

    @GetMapping("core")
    public Boolean core(){
        return feignService.get();
    }
}
