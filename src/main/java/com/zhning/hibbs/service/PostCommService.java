package com.zhning.hibbs.service;

import com.zhning.hibbs.entity.PostComment;
import com.zhning.hibbs.exception.BizException;

import java.util.List;

/**
 * Created by zhning on 2016/2/5.
 */
public interface PostCommService {
    /**
     * 发布评论或者回复
     * @param postComment
     * @throws BizException NULLENTITY(1001,"实体为空")
     */
    void publishPostComm(PostComment postComment) throws BizException;

    /**
     * 得到跟帖的所有评论和回复
     * @param id 跟帖id
     * @return
     * @throws BizException POSTFOLLOWNOTEXIST(1005,"跟帖id不存在")
     */
    List<PostComment> findPostCommList(long id) throws BizException;

    /**
     * 根据评论或者回复id得到评论或者回复——为了跳转到评论所在的位置使用
     * @param id 评论或者回复的id
     * @return
     * @throws BizException POSTCOMMNOTEXIST(1006,"评论或者回复id不存在")
     */
    PostComment findPostComm(long id) throws BizException;
}
