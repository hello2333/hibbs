package com.zhning.hibbs.service;

import com.zhning.hibbs.entity.PostFollow;
import com.zhning.hibbs.exception.BizException;

import java.util.List;

/**
 * Created by zhning on 2016/2/5.
 */
public interface PostFollowService {
    /**
     * 发布跟帖
     * @param postFollow
     * @throws BizException NULLENTITY(1001,"实体为空")
     */
    void publishPostFollow(PostFollow postFollow) throws BizException;

    /**
     * 根据帖子id得到帖子的所有跟帖
     * @param id 帖子id
     * @return
     * @throws BizException POSTNOTEXIST(1002,"帖子id不存在")
     */
    List<PostFollow> findPostFollowList(long id) throws BizException;

    /**
     * 根据跟帖id得到跟帖实体——为了跳转到跟帖所在楼层
     * @param id 跟帖id
     * @return
     * @throws BizException POSTFOLLOWNOTEXIST(1005,"跟帖id不存在")
     */
    PostFollow findPostFollow(long id) throws BizException;
}
