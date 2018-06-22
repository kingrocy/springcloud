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

    @GetMapping("/count")
    public int count(){
        long start=System.currentTimeMillis();
        int count=0;
        for(int i=0;i<8;i++){
            count+=i;
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        long end=System.currentTimeMillis();
        System.out.println("time:"+(end-start)/1000.00);
        return count;
    }

    @Value("${server.port}")
    String port;

    @GetMapping("/service")
    public String service(){
        return "eurekaclient1 service,port:"+port;
    }

}
