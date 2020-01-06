package com.hzit.user.service.imp;

import com.hzit.user.mapper.UserMapper;
import com.hzit.user.pojo.User;
import com.hzit.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImp implements UserService {
    @Autowired
    private UserMapper userMapper;

    @Override
    public User query(String id) {
//        try {
//                Thread.sleep(2000);
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }

        return userMapper.selectByPrimaryKey(id);
    }
}

