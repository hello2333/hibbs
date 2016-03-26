package com.zhning.hibbs.entity;

/**
 * Created by zhning on 2016/2/5.
 */
public class PostFollow{
    /**
     * 跟帖id
     */
    long id;
    /**
     * 跟帖所属帖子id
     */
    long postId;
    /**
     * 跟帖的发帖人id
     */
    long userId;
    /**
     * 跟帖内容
     */
    String text;
    /**
     * 跟帖的发送时间
     */
    long time;
    /**
     *  跟帖包含的图片路径
     */
    String[] picUrls;
    /**
     * 跟帖所在帖子楼层: =插入跟帖时帖子的跟帖数+1
     */
    int floor;
    /**
     * 跟帖的评论数
     */
    int commCount;
    /**
     * 跟帖的已读未读状态
     */
    int state;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getPostId() {
        return postId;
    }

    public void setPostId(long postId) {
        this.postId = postId;
    }

    public long getUserId() {
        return userId;
    }

    public void setUserId(long userId) {
        this.userId = userId;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public long getTime() {
        return time;
    }

    public void setTime(long time) {
        this.time = time;
    }

    public String[] getPicUrls() {
        return picUrls;
    }

    public void setPicUrls(String[] picUrls) {
        this.picUrls = picUrls;
    }

    public int getFloor() {
        return floor;
    }

    public void setFloor(int floor) {
        this.floor = floor;
    }

    public int getCommCount() {
        return commCount;
    }

    public void setCommCount(int commCount) {
        this.commCount = commCount;
    }

    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
    }
}
