package com.kim.springcloud.actuator.controller;

import com.kim.springcloud.actuator.pojo.User;
import com.kim.springcloud.actuator.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author huangjie
 * @description
 * @date 2022-10-28
 */
@RestController
@RequestMapping("/actuator/user")
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("/list")
    public List<User> list(){
        return userService.list();
    }

}
