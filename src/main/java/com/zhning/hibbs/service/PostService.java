package com.zhning.hibbs.service;

import com.zhning.hibbs.entity.Post;
import com.zhning.hibbs.entity.PostCatg;
import com.zhning.hibbs.entity.User;
import com.zhning.hibbs.exception.BizException;

import java.util.List;

/**
 * Created by zhning on 2016/2/5.
 */
public interface PostService {

    //发布帖子
    void publishPost(Post post) throws BizException;

    //按类别浏览帖子
    //TODO：orderBy
    List<Post> findPostByCatg(PostCatg postCatg, int lastestId, String orderBy);

    //在个人中心浏览自己发布的帖子
    List<Post> findMyPost(long userId);

    //在个人中心浏览自己收藏的帖子
    List<Post> findMyCollectPost(long userId);

    //所有帖子
    List<Post> findAllPost();

    //在个人中心管理帖子——删除
    void deletePost(long id);

    //在个人中心管理帖子——批量删除
    void deletePost(List<Long> ids);

    //从消息中心跳转到帖子
    //Post
}
