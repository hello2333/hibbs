package com.zhning.hibbs.dao.impl;

import com.zhning.hibbs.dao.UserDao;
import com.zhning.hibbs.entity.User;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * Created by zhning on 2016/3/13.
 */
@Repository
public class UserDaoImpl extends BaseDaoImpl<User> implements UserDao {
    @Override
    public String getTableName() {
        return "user";
    }

    @Override
    public RowMapper<User> getRowMapper() {
        return new RowMapper<User>() {
            @Override
            public User mapRow(ResultSet resultSet, int i) throws SQLException {
                User user = new User();
                user.setId(resultSet.getLong("id"));
                return user;
            }
        };
    }

}
