package com.lollipop.util.domain;

/**
 * Created by lollipop on 16/7/8.
 */
public class Param {
    private String key;
    private String value;

    /**
     * Instantiates a new Param.
     */
    public Param() {
    }

    /**
     * Instantiates a new Param.
     *
     * @param key   the key
     * @param value the value
     */
    public Param(String key, String value) {
        this.key = key;
        this.value = value;
    }

    /**
     * Gets key.
     *
     * @return the key
     */
    public String getKey() {

        return key;
    }

    /**
     * Sets key.
     *
     * @param key the key
     */
    public void setKey(String key) {
        this.key = key;
    }

    /**
     * Gets value.
     *
     * @return the value
     */
    public String getValue() {
        return value;
    }

    /**
     * Sets value.
     *
     * @param value the value
     */
    public void setValue(String value) {
        this.value = value;
    }
}
