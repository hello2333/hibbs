package com.zhning.hibbs.entity;

import java.util.Date;

/**
 * Created by zhning on 2016/2/5.
 */
public class BaseContent {
    static final int STATE_READ = 1;
    static final int STATE_UNREAD = 2;

    long id;
    long publishTime;


    public BaseContent() {
    }


}
