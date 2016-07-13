package com.lollipop.model;

import java.util.ArrayList;

/**
 * Created by lollipop on 16/7/13.
 */
public class Exam {
    private String examId;
    private String difficulty;
    private String[] question;

    public String getExamId() {
        return examId;
    }

    public void setExamId(String examId) {
        this.examId = examId;
    }

    public String getDifficulty() {
        return difficulty;
    }

    public void setDifficulty(String difficulty) {
        this.difficulty = difficulty;
    }

    public String[] getQuestion() {
        return question;
    }

    public void setQuestion(String[] question) {
        this.question = question;
    }
}
