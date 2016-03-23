package com.zhning.hibbs.mapper;

import com.zhning.hibbs.entity.PostFollow;

import java.util.List;

/**
 * Created by zhning on 2016/2/5.
 */
public interface PostFollowMapper extends BaseMapper<PostFollow> {
    List<PostFollow> findByPostId(long id);
}
