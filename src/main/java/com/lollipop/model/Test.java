package com.lollipop.model;

import org.springframework.stereotype.Repository;

/**
 * Created by lollipop on 16/7/12.
 */

@Repository
public class Test {
    String id;

    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }
}
