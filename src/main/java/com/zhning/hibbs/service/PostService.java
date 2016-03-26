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

    /**
     * 发布帖子
     * @param post
     * @throws BizException post为空
     */
    void publishPost(Post post) throws BizException;
    /**
     * 将帖子存入草稿箱
     * @param post
     * @throws BizException
     */
    void publishDraft(Post post) throws BizException;
    /**
     * 编辑帖子,或者发布草稿箱中的帖子
     * @param post
     * @throws BizException
     */
    void modifyPost(Post post) throws BizException;
    /**
     * 在个人中心管理帖子——删除
     * @param id 要被删除的帖子ID
     */
    void deletePost(long id) throws BizException;;
    /**
     * 在个人中心管理帖子——批量删除
     * @param ids
     */
    void deletePost(List<Long> ids) throws BizException;

    /**
     * 按类别浏览帖子
     * @param catgId 类别ID
     * @param lastestId 之前加载的最后一条帖子的ID
     * @param orderBy 按照距离或者热门程序排序,默认为按时间排序
     * @return 符合要求的帖子列表
     * @throws BizException
     */
    //TODO：orderBy
    List<Post> findPostByCatg(long catgId, int lastestId, String orderBy) throws BizException;;

    /**
     * 在个人中心浏览自己发布的帖子
     * @param userId 用户ID
     * @return
     */
    List<Post> findMyPost(long userId) throws BizException;;

    /**
     * 在个人中心浏览自己收藏的帖子
     * @param userId
     * @return
     */
    List<Post> findMyCollectPost(long userId) throws BizException;;

    /**
     * 所有帖子
     * @return
     */
    List<Post> findAllPost() throws BizException;;

    /*
        从消息中心跳转到帖子:
        1.别人点赞——根据帖子ID跳转到帖子
        2.别人评论——跳转到对应楼层,根据帖子ID跳转到帖子,根据评论ID对应的跟帖Id跳转到对应楼层
        3.别人跟帖——跳转到对应楼层,根据帖子ID跳转到帖子,根据跟帖ID跳转到楼层
        4.别人回复——跳转到对应楼层,根据帖子ID跳转到帖子,根据回复ID对应的评论ID对应的跟帖ID跳转到对应楼层
     */

    /**
     * 根据帖子id得到帖子实体
     * @param id
     * @return
     */
    Post postDetail(long id) throws BizException;;
}
