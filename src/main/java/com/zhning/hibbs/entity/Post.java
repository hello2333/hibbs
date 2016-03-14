package com.zhning.hibbs.entity;

/**
 * Created by zhning on 2016/2/5.
 */
public class Post extends BaseContent{
    String title;
    String[] picsURL;
    int followCount;
    PostCatg category;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String[] getPicsURL() {
        return picsURL;
    }

    public void setPicsURL(String[] picsURL) {
        this.picsURL = picsURL;
    }

    public int getFollowCount() {
        return followCount;
    }

    public void setFollowCount(int followCount) {
        this.followCount = followCount;
    }

    public PostCatg getCategory() {
        return category;
    }

    public void setCategory(PostCatg category) {
        this.category = category;
    }
}
