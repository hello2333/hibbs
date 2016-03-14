package com.zhning.hibbs.dao;

import com.zhning.hibbs.entity.PostFollow;

import java.util.List;

/**
 * Created by zhning on 2016/2/5.
 */
public interface PostFollowDao extends BaseDao<PostFollow> {
    List<PostFollow> findByPostId(long id);
}
