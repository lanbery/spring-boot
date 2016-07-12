package com.lollipop.model;

/**
 * Created by lollipop on 16/7/7.
 */
public class Answer {
    private String id;
    private String qusetionId;
    private String content;
    private String imgPath;

    public Answer() {

    }

    public Answer(String id, String qusetionId, String content, String imgPath) {

        this.id = id;
        this.qusetionId = qusetionId;
        this.content = content;
        this.imgPath = imgPath;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getQusetionId() {
        return qusetionId;
    }

    public void setQusetionId(String qusetionId) {
        this.qusetionId = qusetionId;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getImgPath() {
        return imgPath;
    }

    public void setImgPath(String imgPath) {
        this.imgPath = imgPath;
    }
}
