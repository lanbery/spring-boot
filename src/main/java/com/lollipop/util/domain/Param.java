package com.lollipop.util.domain;

/**
 * Created by lollipop on 16/7/8.
 */
public class Param {
    private String key;

    public Param() {
    }

    private String value;

    public Param(String key, String value) {
        this.key = key;
        this.value = value;
    }

    public String getKey() {

        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}
