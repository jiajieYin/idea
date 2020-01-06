package com.hzit.user.controller;

import com.hzit.user.pojo.User;
import com.hzit.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("user")
public class UserController {
    @Autowired
    private UserService userService;
    @RequestMapping("{id}")
    @ResponseBody
    public User query(@PathVariable("id") String id){
    return userService.query(id);
    }
}
