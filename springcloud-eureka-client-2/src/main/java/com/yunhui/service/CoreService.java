package com.yunhui.service;
import com.yunhui.utils.FlumeClient;
import org.springframework.beans.factory.annotation.Autowired;
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


    @Autowired
    FlumeClient client;

    @GetMapping("/log")
    public String log(){
        client.info("hello,this is Eureka Client-2");
        return "success";
    }

}
