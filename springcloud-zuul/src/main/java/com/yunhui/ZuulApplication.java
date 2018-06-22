package com.yunhui;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: Yun
 * @Description:
 * @Date: Created in 2018-06-22 11:01
 */
@SpringBootApplication
@EnableEurekaClient
@EnableZuulProxy
@RestController
public class ZuulApplication {
    public static void main(String[] args) {
        SpringApplication.run(ZuulApplication.class);
    }

    @Value("${zuul.routes.eurekaclient1.path}")
    String path1;


    @Value("${zuul.routes.eurekaclient1.serviceId}")
    String service1;


    @Value("${zuul.routes.eurekaclient2.path}")
    String path2;


    @Value("${zuul.routes.eurekaclient2.serviceId}")
    String service2;

    @GetMapping("/env")
    public String env(){
        return "{\"path1\":\""+path1+"\",\"service1\":\""+service1+"\",\"path2\":\""+path2+"\",\"service2\":\""+service2+"\"}";
    }
}
