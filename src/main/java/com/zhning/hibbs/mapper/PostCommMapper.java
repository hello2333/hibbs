package com.zhning.hibbs.mapper;

import com.zhning.hibbs.entity.PostComment;

import java.util.List;

/**
 * Created by zhning on 2016/2/5.
 */
public interface PostCommMapper {
    List<PostComment> findByFollowId(long id);
}
