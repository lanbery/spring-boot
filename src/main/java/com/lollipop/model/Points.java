package com.lollipop.model;

import org.springframework.stereotype.Repository;

import java.util.ArrayList;

/**
 * Created by lollipop on 16/7/13.
 */

@Repository
public class Points {
    private String pointId;
    private String parent;
    private ArrayList<String> children;
    private String name;
    private String type;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getPointId() {
        return pointId;
    }

    public void setPointId(String pointId) {
        this.pointId = pointId;
    }

    public String getParent() {
        return parent;
    }

    public void setParent(String parent) {
        this.parent = parent;
    }

    public ArrayList<String> getChilderen() {
        return children;
    }

    public void setChildren(ArrayList<String> children) {
        this.children = children;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
