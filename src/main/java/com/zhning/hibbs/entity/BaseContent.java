package com.zhning.hibbs.entity;

import java.util.Date;

/**
 * Created by zhning on 2016/2/5.
 */
public class BaseContent {
    static final int STATE_REDA = 1;
    static final int STATE_UNREDA = 2;

    long id;
    Date publishTime;
    String text;
    User user;

    public BaseContent() {
    }

    public BaseContent(User user, String text, Date publishTime) {
        this.user = user;
        this.text = text;
        this.publishTime = publishTime;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Date getPublishTime() {
        return publishTime;
    }

    public void setPublishTime(Date publishTime) {
        this.publishTime = publishTime;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
