package com.lollipop.model;

import org.springframework.stereotype.Repository;

import java.util.ArrayList;

/**
 * Created by lollipop on 16/7/13.
 */

@Repository
public class Exam {
    private String examId;
    private String difficulty;
    private ArrayList<Question> questions;

    public ArrayList<Question> getQuestions() {
        return questions;
    }

    public void setQuestions(ArrayList<Question> questions) {
        this.questions = questions;
    }

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
}
