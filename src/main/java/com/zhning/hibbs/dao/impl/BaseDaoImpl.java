package com.zhning.hibbs.dao.impl;

import com.google.common.base.Joiner;
import com.google.common.collect.Lists;
import com.zhning.hibbs.dao.BaseDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowCallbackHandler;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.*;

/**
 * Created by zhning on 2016/3/13.
 */
@Repository
public abstract class BaseDaoImpl<T> implements BaseDao<T> {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public T findBySelfId(long id) {
        return null;
    }

    @Override
    public List<T> findByProp(Map<String, ?> prop) {
        List<String> keys = Lists.newArrayList();
        List params = Lists.newArrayList();
        for (Map.Entry<String, ?> entry: prop.entrySet()) {
            keys.add(entry.getKey());
            params.add(entry.getValue());
        }
        String sql = "SELECT * FROM " + getTableName() + " WHERE ";
        sql += Joiner.on("=? AND ").join(keys);
        sql += "=?";
        List<T> res = jdbcTemplate.query(sql, params.toArray(), getRowMapper());
        return res;
    }

    @Override
    public void add(T object) {

    }

    @Override
    public T update(T object) {
        return null;
    }

    @Override
    public void delete(long id) {

    }

    public abstract String getTableName();
    public abstract RowMapper<T> getRowMapper();
}
