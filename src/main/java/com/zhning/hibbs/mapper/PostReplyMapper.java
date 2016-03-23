package com.zhning.hibbs.mapper;

import com.zhning.hibbs.entity.PostReply;

import java.util.List;

/**
 * Created by zhning on 2016/2/5.
 */
public interface PostReplyMapper extends BaseMapper<PostReply> {
    List<PostReply> findByCommId(long id);
    List<PostReply> findByReplyId(long id);
}
