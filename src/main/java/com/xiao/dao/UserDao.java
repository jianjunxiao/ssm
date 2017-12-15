package com.xiao.dao;

import com.xiao.entity.User;

/**
 * Created by xiaoyanger on 2017/12/15.
 */
public interface UserDao {
    User selectUserById(long id);
}
