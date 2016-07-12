package com.lollipop.model;

import java.util.ArrayList;

/**
 * Created by lollipop on 16/7/7.
 */
public class KonwledgePionts {

    private String id;
    private String parent;
    private ArrayList<String> children;
    private String title;
    private boolean hasTag;

    public KonwledgePionts() {
    }

    public KonwledgePionts(String id, boolean hasTag, String title, String parent, ArrayList<String> children) {

        this.id = id;
        this.hasTag = hasTag;
        this.title = title;
        this.parent = parent;
        this.children = children;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getParent() {
        return parent;
    }

    public void setParent(String parent) {
        this.parent = parent;
    }

    public ArrayList<String> getChildren() {
        return children;
    }

    public void setChildren(ArrayList<String> children) {
        this.children = children;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public boolean isHasTag() {
        return hasTag;
    }

    public void setHasTag(boolean hasTag) {
        this.hasTag = hasTag;
    }
}
