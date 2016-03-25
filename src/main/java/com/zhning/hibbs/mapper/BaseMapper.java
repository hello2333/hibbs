package com.zhning.hibbs.mapper;

import java.util.List;
import java.util.Map;

/**
 * Created by zhning on 2016/2/5.
 */

/**
 * mybatis公共接口
 *
 * @author zhning
 *
 * @param <T>
 */
public interface BaseMapper<T> {
    /**
     * 通过自身的id得到entity
     * @param id
     * @return
     */
    //T findBySelfId(long id);

    /**
     * 通过指定条件查询entity
     * @param conditions
     * @return
     */
    //List<T> findByProp(Map<String, ?> conditions);

    /**
     * 插入对象
     * @param object
     */
    void insert(T object);

    /**
     * 更新对象
     * @param object
     * @return
     */
    T update(T object);

    /**
     * 删除对象
     * @param id
     */
    void delete(long id);
}
