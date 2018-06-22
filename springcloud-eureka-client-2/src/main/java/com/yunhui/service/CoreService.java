package com.yunhui.service;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: Yun
 * @Description:
 * @Date: Created in 2018-06-21 15:24
 */
@RestController
public class CoreService {


    @Value("${server.port}")
    String port;

    @GetMapping("/service")
    public String service(){
        return "eurekaclient2 service,port:"+port;
    }

}
