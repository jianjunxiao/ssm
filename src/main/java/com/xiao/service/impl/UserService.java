package com.xiao.service.impl;

import com.xiao.dao.UserDao;
import com.xiao.entity.User;
import com.xiao.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by xiaoyanger on 2017/12/15.
 */
@Service
public class UserService implements IUserService {

    @Autowired
    private UserDao userDao;

    public User selectUserById(long id) {
        return userDao.selectUserById(id);
    }
}
