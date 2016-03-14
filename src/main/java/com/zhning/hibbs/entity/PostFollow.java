package com.zhning.hibbs.entity;

/**
 * Created by zhning on 2016/2/5.
 */
public class PostFollow extends BaseContent{
    long postId;
    String[] picsURL;
    int floor;
    int commCount;
    int state;

    public long getPostId() {
        return postId;
    }

    public void setPostId(long postId) {
        this.postId = postId;
    }

    public String[] getPicsURL() {
        return picsURL;
    }

    public void setPicsURL(String[] picsURL) {
        this.picsURL = picsURL;
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
