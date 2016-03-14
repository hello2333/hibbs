package com.zhning.hibbs.entity;

/**
 * Created by zhning on 2016/2/5.
 */
public class PostCatg {
    long id;
    String catgName;

    public PostCatg() {
    }

    public PostCatg(String catgName) {
        this.catgName = catgName;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getCatgName() {
        return catgName;
    }

    public void setCatgName(String catgName) {
        this.catgName = catgName;
    }
}
