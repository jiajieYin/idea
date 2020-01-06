package com.hzit.consumer.clients;

import com.hzit.consumer.pojo.User;
import org.springframework.stereotype.Component;

@Component
public class MyFeignClientImpl implements MyFeignClient {
    @Override
    public User query(String id) {
        User user = new User();
        user.setUsername("未知用户");
        return user;
    }
}
