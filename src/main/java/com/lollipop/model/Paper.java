package com.lollipop.model;

import java.util.ArrayList;

/**
 * Created by lollipop on 16/7/7.
 */

public class Paper {
    private String id;
    private String grade;
    private String name;
    private String date;
    private String paperType;
    private String examDuration;
    private String source;
    private ArrayList<Questions> parts;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getPaperType() {
        return paperType;
    }

    public void setPaperType(String paperType) {
        this.paperType = paperType;
    }

    public String getExamDuration() {
        return examDuration;
    }

    public void setExamDuration(String examDuration) {
        this.examDuration = examDuration;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public ArrayList<Questions> getParts() {
        return parts;
    }

    public void setParts(ArrayList<Questions> parts) {
        this.parts = parts;
    }

}
