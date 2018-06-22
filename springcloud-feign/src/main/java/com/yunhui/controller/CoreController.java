package com.yunhui.controller;

//import com.yunhui.service.IEurekaClientService;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.web.bind.annotation.GetMapping;
import com.yunhui.service.IEurekaClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: Yun
 * @Description:
 * @Date: Created in 2018-06-21 15:30
 */
@RestController
public class CoreController {

    @Autowired
    IEurekaClientService eurekaClientService;

    @GetMapping("/count")
    public int count(){
        return eurekaClientService.count();
    }

}
