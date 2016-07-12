package com.lollipop.model;

/**
 * Created by lollipop on 16/7/7.
 */
public class Answer {

    private String id;
    private String qusetionId;
    private String content;
    private String imgPath;

    /**
     * Instantiates a new Answer.
     */
    public Answer() {

    }

    /**
     * Instantiates a new Answer.
     *
     * @param id         the id
     * @param qusetionId the qusetion id
     * @param content    the content
     * @param imgPath    the img path
     */
    public Answer(String id, String qusetionId, String content, String imgPath) {

        this.id = id;
        this.qusetionId = qusetionId;
        this.content = content;
        this.imgPath = imgPath;
    }

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
     * Gets qusetion id.
     *
     * @return the qusetion id
     */
    public String getQusetionId() {
        return qusetionId;
    }

    /**
     * Sets qusetion id.
     *
     * @param qusetionId the qusetion id
     */
    public void setQusetionId(String qusetionId) {
        this.qusetionId = qusetionId;
    }

    /**
     * Gets content.
     *
     * @return the content
     */
    public String getContent() {
        return content;
    }

    /**
     * Sets content.
     *
     * @param content the content
     */
    public void setContent(String content) {
        this.content = content;
    }

    /**
     * Gets img path.
     *
     * @return the img path
     */
    public String getImgPath() {
        return imgPath;
    }

    /**
     * Sets img path.
     *
     * @param imgPath the img path
     */
    public void setImgPath(String imgPath) {
        this.imgPath = imgPath;
    }
}
