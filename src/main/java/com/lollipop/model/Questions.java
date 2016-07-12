package com.lollipop.model;

import java.util.ArrayList;

/**
 * Created by lollipop on 16/7/7.
 */
public class Questions {

    private String id;
    private String type;

    private String questionType;
    private String score;
    private String difficulty;
    private String number;
    private String imgPath;

    private ArrayList<String> konwledgePionts;
    private ArrayList<String> source;

    public Questions() {

    }

    public Questions(String id, String type, String questionType, String score, String difficulty, String number, String imgPath, ArrayList<String> konwledgePionts, ArrayList<String> source) {
        this.id = id;
        this.type = type;
        this.questionType = questionType;
        this.score = score;
        this.difficulty = difficulty;
        this.number = number;

        this.imgPath = imgPath;
        this.konwledgePionts = konwledgePionts;
        this.source = source;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getQuestionType() {
        return questionType;
    }

    public void setQuestionType(String questionType) {
        this.questionType = questionType;
    }

    public String getScore() {
        return score;
    }

    public void setScore(String score) {
        this.score = score;
    }

    public String getDifficulty() {
        return difficulty;
    }

    public void setDifficulty(String difficulty) {
        this.difficulty = difficulty;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getImgPath() {
        return imgPath;
    }

    public void setImgPath(String imgPath) {
        this.imgPath = imgPath;
    }

    public ArrayList<String> getKonwledgePionts() {
        return konwledgePionts;
    }

    public void setKonwledgePionts(ArrayList<String> konwledgePionts) {
        this.konwledgePionts = konwledgePionts;
    }

    public ArrayList<String> getSource() {
        return source;
    }

    public void setSource(ArrayList<String> source) {
        this.source = source;
    }
}
