package com.yunhui;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: Yun
 * @Description:
 * @Date: Created in 2018-05-24 18:26
 */
@SpringBootApplication
@EnableEurekaClient
@RestController
@RefreshScope
public class ConfigServerClientApplication {

    public static void main(String[] args){
        SpringApplication.run(ConfigServerClientApplication.class);
    }

    @Value("${environment}")
    String environment;

    @RequestMapping("/env")
    public String from() {
        return environment;
    }
}
