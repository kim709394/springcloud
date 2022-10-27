package com.kim.springcloud.actuator.service.impl;

import com.kim.springcloud.actuator.pojo.User;
import com.kim.springcloud.actuator.service.UserService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * @author huangjie
 * @description
 * @date 2022-10-28
 */
@Service
public class UserServiceImpl implements UserService {


    @Override
    public List<User> list() {
        User u1=new User();
        u1.setId(1);
        u1.setUsername("kim");
        User u2=new User();
        u2.setId(2);
        u2.setUsername("mike");
        List<User> userList=new ArrayList<>();
        userList.add(u1);
        userList.add(u2);
        return userList;
    }
}
