package com.hzit.consumer.clients;

import com.hzit.consumer.pojo.User;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
@FeignClient(value = "userservice",fallback = MyFeignClientImpl.class)
public  interface MyFeignClient {
    @GetMapping("/user/{id}")
    User query(@PathVariable("id") String id);
}
