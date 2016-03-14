package com.zhning.hibbs.dao;

import java.util.List;
import java.util.Map;

/**
 * Created by zhning on 2016/2/5.
 */
public interface BaseDao<T> {
    T findBySelfId(long id);
    List<T> findByProp(Map<String, ?> prop);
    void add(T object);
    T update(T object);
    void delete(long id);
}
