package com.yunhui.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


@FeignClient(value = "nacos-config")
public interface FeignService {

    @RequestMapping(value = "/config/get", method = RequestMethod.GET)
    Boolean get();
}
