package com.yunhui.utils;

/**
 * @Author: Yun
 * @Description:
 * @Date: Created in 2018-07-02 15:29
 */
public enum  FlumeLevelEnum {

    FLUME_LEVEL_INFO("info"),FLUME_LEVEL_ERROR("error");

    FlumeLevelEnum(String level) {
        this.level = level;
    }

    private String level;

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }
}
