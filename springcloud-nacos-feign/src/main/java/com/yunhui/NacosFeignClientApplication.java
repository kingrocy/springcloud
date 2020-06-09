package com.yunhui;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @Author: Yun
 * @Description:
 * @Date: Created in 2018-05-24 17:12
 */
@EnableFeignClients
@EnableDiscoveryClient
@SpringBootApplication
public class NacosFeignClientApplication {

    public static void main(String[] args) {
        SpringApplication.run(NacosFeignClientApplication.class);
    }

}
