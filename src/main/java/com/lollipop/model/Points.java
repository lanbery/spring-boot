package com.lollipop.model;

/**
 * Created by lollipop on 16/7/13.
 */
public class Points {
    private String pointId;
    private String parent;
    private String[] childeren;
    private String name;

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

    public String[] getChilderen() {
        return childeren;
    }

    public void setChilderen(String[] childeren) {
        this.childeren = childeren;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
