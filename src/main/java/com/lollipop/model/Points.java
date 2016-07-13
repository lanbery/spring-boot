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

    /**
     * Gets type.
     *
     * @return the type
     */
    public String getType() {
        return type;
    }

    /**
     * Sets type.
     *
     * @param type the type
     */
    public void setType(String type) {
        this.type = type;
    }

    /**
     * Gets point id.
     *
     * @return the point id
     */
    public String getPointId() {
        return pointId;
    }

    /**
     * Sets point id.
     *
     * @param pointId the point id
     */
    public void setPointId(String pointId) {
        this.pointId = pointId;
    }

    /**
     * Gets parent.
     *
     * @return the parent
     */
    public String getParent() {
        return parent;
    }

    /**
     * Sets parent.
     *
     * @param parent the parent
     */
    public void setParent(String parent) {
        this.parent = parent;
    }

    /**
     * Gets childeren.
     *
     * @return the childeren
     */
    public ArrayList<String> getChilderen() {
        return children;
    }

    /**
     * Sets children.
     *
     * @param children the children
     */
    public void setChildren(ArrayList<String> children) {
        this.children = children;
    }

    /**
     * Gets name.
     *
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * Sets name.
     *
     * @param name the name
     */
    public void setName(String name) {
        this.name = name;
    }
}
