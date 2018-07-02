package com.yunhui.conf;

import com.yunhui.utils.FlumeClient;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @Author: Yun
 * @Description:
 * @Date: Created in 2018-07-02 16:48
 */
@Configuration
public class MyConfiguration {

    @Value("${source}")
    String sourceName;

    @Value("${environment}")
    String environment;

    @Bean(value = "flumeClient",initMethod = "init",destroyMethod = "close")
    public FlumeClient flumeClient(){
        return new FlumeClient(sourceName,environment);
    }

}
