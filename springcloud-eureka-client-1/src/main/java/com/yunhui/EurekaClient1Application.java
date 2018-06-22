package com.yunhui;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @Author: Yun
 * @Description:
 * @Date: Created in 2018-05-24 17:12
 */
@EnableEurekaClient
@SpringBootApplication
public class EurekaClient1Application {

    public static void main(String[] args) {
        SpringApplication.run(EurekaClient1Application.class);
    }

}
