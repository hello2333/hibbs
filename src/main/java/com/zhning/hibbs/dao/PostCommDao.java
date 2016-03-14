package com.zhning.hibbs.dao;

import com.zhning.hibbs.entity.PostComment;

import java.util.List;

/**
 * Created by zhning on 2016/2/5.
 */
public interface PostCommDao extends BaseDao<PostComment>{
    List<PostComment> findByFollowId(long id);
}
