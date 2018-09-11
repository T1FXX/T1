package com.xinshi.Dao;

import com.xinshi.entity.dev_user;

import java.util.List;

public interface DevUserDao {
    dev_user QueryUserByLogin(dev_user user);
}
