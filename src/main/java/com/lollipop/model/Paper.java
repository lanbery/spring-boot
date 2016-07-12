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

    /**
     * Gets grade.
     *
     * @return the grade
     */
    public String getGrade() {
        return grade;
    }

    /**
     * Sets grade.
     *
     * @param grade the grade
     */
    public void setGrade(String grade) {
        this.grade = grade;
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

    /**
     * Gets date.
     *
     * @return the date
     */
    public String getDate() {
        return date;
    }

    /**
     * Sets date.
     *
     * @param date the date
     */
    public void setDate(String date) {
        this.date = date;
    }

    /**
     * Gets paper type.
     *
     * @return the paper type
     */
    public String getPaperType() {
        return paperType;
    }

    /**
     * Sets paper type.
     *
     * @param paperType the paper type
     */
    public void setPaperType(String paperType) {
        this.paperType = paperType;
    }

    /**
     * Gets exam duration.
     *
     * @return the exam duration
     */
    public String getExamDuration() {
        return examDuration;
    }

    /**
     * Sets exam duration.
     *
     * @param examDuration the exam duration
     */
    public void setExamDuration(String examDuration) {
        this.examDuration = examDuration;
    }

    /**
     * Gets source.
     *
     * @return the source
     */
    public String getSource() {
        return source;
    }

    /**
     * Sets source.
     *
     * @param source the source
     */
    public void setSource(String source) {
        this.source = source;
    }

    /**
     * Gets parts.
     *
     * @return the parts
     */
    public ArrayList<Questions> getParts() {
        return parts;
    }

    /**
     * Sets parts.
     *
     * @param parts the parts
     */
    public void setParts(ArrayList<Questions> parts) {
        this.parts = parts;
    }

}
