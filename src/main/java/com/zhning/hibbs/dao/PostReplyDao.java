package com.zhning.hibbs.dao;

import com.zhning.hibbs.entity.PostReply;

import java.util.List;

/**
 * Created by zhning on 2016/2/5.
 */
public interface PostReplyDao extends BaseDao<PostReply> {
    List<PostReply> findByCommId(long id);
    List<PostReply> findByReplyId(long id);
}
