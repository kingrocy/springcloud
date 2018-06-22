package com.yunhui.service;

import com.yunhui.service.fallback.EurekaClientHystrix;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @Author: Yun
 * @Description:
 * @Date: Created in 2018-06-21 15:28
 */
@FeignClient(value="eureka-client-1",fallback = EurekaClientHystrix.class)
public interface IEurekaClientService {

    @RequestMapping(value = "/eurekaclient/count",method = RequestMethod.GET)
    int count();
}
