package com.lollipop.model;

import org.springframework.stereotype.Repository;

/**
 * Created by lollipop on 16/7/12.
 */
@Repository
public class Test {
    private String id;

    /**
     * Gets id.
     *
     * @return the id
     */
    public String getId() {
        return id;
    }

    /**
     * Sets id.
     *
     * @param id the id
     */
    public void setId(String id) {
        this.id = id;
    }
}
