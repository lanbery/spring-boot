package com.lollipop.model;

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

    /**
     * Gets question jiexi img.
     *
     * @return the question jiexi img
     */
    public String getQuestionJiexiImg() {
        return questionJiexiImg;
    }

    /**
     * Sets question jiexi img.
     *
     * @param questionJiexiImg the question jiexi img
     */
    public void setQuestionJiexiImg(String questionJiexiImg) {
        this.questionJiexiImg = questionJiexiImg;
    }

    /**
     * Gets question content.
     *
     * @return the question content
     */
    public String getQuestionContent() {
        return questionContent;
    }

    /**
     * Sets question content.
     *
     * @param questionContent the question content
     */
    public void setQuestionContent(String questionContent) {
        this.questionContent = questionContent;
    }

    /**
     * Gets question id.
     *
     * @return the question id
     */
    public String getQuestionId() {
        return questionId;
    }

    /**
     * Sets question id.
     *
     * @param questionId the question id
     */
    public void setQuestionId(String questionId) {
        this.questionId = questionId;
    }

    /**
     * Gets question type.
     *
     * @return the question type
     */
    public String getQuestionType() {
        return questionType;
    }

    /**
     * Sets question type.
     *
     * @param questionType the question type
     */
    public void setQuestionType(String questionType) {
        this.questionType = questionType;
    }

    /**
     * Gets question img.
     *
     * @return the question img
     */
    public String getQuestionImg() {
        return questionImg;
    }

    /**
     * Sets question img.
     *
     * @param questionImg the question img
     */
    public void setQuestionImg(String questionImg) {
        this.questionImg = questionImg;
    }

    /**
     * Sets question points.
     *
     * @param questionPoints the question points
     */
    public void setQuestionPoints(ArrayList<String> questionPoints) {
        this.questionPoints = questionPoints;
    }

    /**
     * Gets question answer.
     *
     * @return the question answer
     */
    public String getQuestionAnswer() {
        return questionAnswer;
    }

    /**
     * Sets question answer.
     *
     * @param questionAnswer the question answer
     */
    public void setQuestionAnswer(String questionAnswer) {
        this.questionAnswer = questionAnswer;
    }

    /**
     * Gets question jiexi.
     *
     * @return the question jiexi
     */
    public String getQuestionJiexi() {
        return questionJiexi;
    }

    /**
     * Sets question jiexi.
     *
     * @param questionJiexi the question jiexi
     */
    public void setQuestionJiexi(String questionJiexi) {
        this.questionJiexi = questionJiexi;
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
