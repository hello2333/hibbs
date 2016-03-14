package com.zhning.hibbs.entity;


import com.google.common.base.MoreObjects;

/**
 * Created by zhning on 2016/2/5.
 */
public class User {
    long id;
//    /*String name;
//    String portraitThumbURL*/;
//
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }
//
//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
//
//    public String getPortraitThumbURL() {
//        return portraitThumbURL;
//    }
//
//    public void setPortraitThumbURL(String portraitThumbURL) {
//        this.portraitThumbURL = portraitThumbURL;
//    }

    @Override
    public String toString() {
        return MoreObjects.toStringHelper(this).add("id", id).toString();
    }
}
