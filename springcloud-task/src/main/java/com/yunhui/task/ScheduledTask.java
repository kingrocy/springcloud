package com.yunhui.task;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.util.Date;

/**
 * Title: ScheduledTask.java <br>
 * Description: <br>
 * Copyright (c) 聚阿网络科技版权所有 2018 <br>
 * Create DateTime: 2018年11月02日 11:31 <br>
 *
 * @author yun
 */
@Component
public class ScheduledTask {

    /**
     * 每隔1秒执行, 单位：ms。
     */
    @Scheduled(fixedRate = 5000)
    public void testFixRate() {
        System.out.println("curTime:"+new Date());
    }


}
