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

    /**
     * Gets questions.
     *
     * @return the questions
     */
    public ArrayList<Question> getQuestions() {
        return questions;
    }

    /**
     * Sets questions.
     *
     * @param questions the questions
     */
    public void setQuestions(ArrayList<Question> questions) {
        this.questions = questions;
    }

    /**
     * Gets exam id.
     *
     * @return the exam id
     */
    public String getExamId() {
        return examId;
    }

    /**
     * Sets exam id.
     *
     * @param examId the exam id
     */
    public void setExamId(String examId) {
        this.examId = examId;
    }

    /**
     * Gets difficulty.
     *
     * @return the difficulty
     */
    public String getDifficulty() {
        return difficulty;
    }

    /**
     * Sets difficulty.
     *
     * @param difficulty the difficulty
     */
    public void setDifficulty(String difficulty) {
        this.difficulty = difficulty;
    }
}
