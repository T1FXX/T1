package com.xinshi.service.impl;

import com.xinshi.Dao.DevUserDao;
import com.xinshi.entity.dev_user;
import com.xinshi.service.DevUserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class DevUserServiceimpl implements DevUserService {

    @Resource
    private DevUserDao dao;

    public dev_user QueryUserByLogin(dev_user user) {
        return dao.QueryUserByLogin(user);
    }
}
