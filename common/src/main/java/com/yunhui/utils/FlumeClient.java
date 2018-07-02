package com.yunhui.utils;

import com.yunhui.constant.FlumeConstant;
import org.apache.flume.Event;
import org.apache.flume.EventDeliveryException;
import org.apache.flume.api.RpcClient;
import org.apache.flume.api.RpcClientFactory;
import org.apache.flume.event.EventBuilder;
import java.nio.charset.Charset;
import java.util.HashMap;
import java.util.Map;

/**
 * flume工具类
 */
public class FlumeClient {

    private RpcClient client;

    private String sourceName;

    private String environment;

    public FlumeClient(String sourceName, String environment) {
        this.sourceName=sourceName;
        this.environment=environment;
    }

    private void init() {
        this.client=RpcClientFactory.getDefaultInstance(FlumeConstant.IP, FlumeConstant.PORT);
    }

    private void sendDataToFlume(String data, String sourceName, String environment, String level) {
        Event event = EventBuilder.withBody(data, Charset.forName("UTF-8"));
        Map<String, String> hdrs = new HashMap();
        hdrs.put("timestamp", String.valueOf(System.currentTimeMillis()));
        hdrs.put("flume.client.source", sourceName);
        hdrs.put("flume.client.environment", environment);
        hdrs.put("flume.client.level", level);
        event.setHeaders(hdrs);
        try {
            client.append(event);
        } catch (EventDeliveryException e) {
            client.close();
            client = null;
            client = RpcClientFactory.getDefaultInstance(FlumeConstant.IP, FlumeConstant.PORT);
        }
    }

    private void close() {
        if (client != null) {
            client.close();
        }
    }

    public void info(String data) {
        sendDataToFlume(data, sourceName, environment, FlumeLevelEnum.FLUME_LEVEL_INFO.getLevel());
    }

    public void error(String data) {
        sendDataToFlume(data, sourceName, environment, FlumeLevelEnum.FLUME_LEVEL_ERROR.getLevel());
    }
}