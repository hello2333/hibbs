package com.zhning.hibbs.entity;

/**
 * Created by zhning on 2016/2/5.
 */
public class Post{
    /**
     * 帖子ID
     */
    long id;
    /**
     * 发帖用户ID
     */
    long userId;
    /**
     * 帖子所属类别ID
     */
    long catgId;
    /**
     * 帖子c标题
     */
    String title;
    /**
     * 帖子内容
     */
    String text;
    /**
     *
     */
    long publishTime;
    /**
     * 帖子的图片集合
     */
    String[] picUrls;
    /**
     * 跟帖数
     */
    int followCount;
    /**
     * 帖子的点赞数
     */
    int supportCount;
    /**
     * 帖子的收藏数
     */
    int collectCount;


    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getUserId() {
        return userId;
    }

    public void setUserId(long userId) {
        this.userId = userId;
    }

    public long getCatgId() {
        return catgId;
    }

    public void setCatgId(long catgId) {
        this.catgId = catgId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public long getPublishTime() {
        return publishTime;
    }

    public void setPublishTime(long publishTime) {
        this.publishTime = publishTime;
    }

    public String[] getPicUrls() {
        return picUrls;
    }

    public void setPicUrls(String[] picUrls) {
        this.picUrls = picUrls;
    }

    public int getFollowCount() {
        return followCount;
    }

    public void setFollowCount(int followCount) {
        this.followCount = followCount;
    }

    public int getSupportCount() {
        return supportCount;
    }

    public void setSupportCount(int supportCount) {
        this.supportCount = supportCount;
    }

    public int getCollectCount() {
        return collectCount;
    }

    public void setCollectCount(int collectCount) {
        this.collectCount = collectCount;
    }
}
