package com.lollipop.model;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;

/**
 * Created by lollipop on 16/7/13.
 */

@Repository
public class Question {
    private String questionId;
    private String questionType;
    private String questionContent;
    private String questionImg;
    private ArrayList<String> questionPoints;
    private String questionAnswer;
    private String questionJiexi;
    private String questionJiexiImg;
    private String difficulty;

    public String getQuestionJiexiImg() {
        return questionJiexiImg;
    }

    public void setQuestionJiexiImg(String questionJiexiImg) {
        this.questionJiexiImg = questionJiexiImg;
    }

    public String getQuestionContent() {
        return questionContent;
    }

    public void setQuestionContent(String questionContent) {
        this.questionContent = questionContent;
    }

    public String getQuestionId() {
        return questionId;
    }

    public void setQuestionId(String questionId) {
        this.questionId = questionId;
    }

    public String getQuestionType() {
        return questionType;
    }

    public void setQuestionType(String questionType) {
        this.questionType = questionType;
    }

    public String getQuestionImg() {
        return questionImg;
    }

    public void setQuestionImg(String questionImg) {
        this.questionImg = questionImg;
    }

    public void setQuestionPoints(ArrayList<String> questionPoints) {
        this.questionPoints = questionPoints;
    }

    public String getQuestionAnswer() {
        return questionAnswer;
    }

    public void setQuestionAnswer(String questionAnswer) {
        this.questionAnswer = questionAnswer;
    }

    public String getQuestionJiexi() {
        return questionJiexi;
    }

    public void setQuestionJiexi(String questionJiexi) {
        this.questionJiexi = questionJiexi;
    }

    public String getDifficulty() {
        return difficulty;
    }

    public void setDifficulty(String difficulty) {
        this.difficulty = difficulty;
    }

}
