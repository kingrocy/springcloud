package com.yunhui.service.fallback;

import com.yunhui.service.IEurekaClientService;
import org.springframework.stereotype.Component;

/**
 * @Author: Yun
 * @Description:
 * @Date: Created in 2018-06-21 16:04
 */
@Component
public class EurekaClientHystrix implements IEurekaClientService {
    @Override
    public int count() {
        System.out.println("===============进入EurekaClientHystrix熔断===================");
        return 0;
    }
}
