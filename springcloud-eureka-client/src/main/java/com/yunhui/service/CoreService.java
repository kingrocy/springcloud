package com.yunhui.service;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: Yun
 * @Description:
 * @Date: Created in 2018-06-21 15:24
 */
@RestController
@RequestMapping("/eurekaclient")
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

}
