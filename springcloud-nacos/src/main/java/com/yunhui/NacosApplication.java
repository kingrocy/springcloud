package com.yunhui;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.ConfigurableApplicationContext;

/**
 * @Date : 2020/6/9 4:04 下午
 * @Author : dushaoyun
 */
@SpringBootApplication
@EnableDiscoveryClient
public class NacosApplication {

    public static void main(String[] args) {
        ConfigurableApplicationContext applicationContext = SpringApplication.run(NacosApplication.class, args);
        String userName = applicationContext.getEnvironment().getProperty("user.name");
        String userAge = applicationContext.getEnvironment().getProperty("user.age");
        String useLocalCache = applicationContext.getEnvironment().getProperty("useLocalCache");
        System.err.println("user name :"+userName+"; age: "+userAge+"; useLocalCache: "+useLocalCache);
    }
}