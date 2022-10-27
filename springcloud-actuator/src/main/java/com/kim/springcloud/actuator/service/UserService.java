package com.kim.springcloud.actuator.service;

import com.kim.springcloud.actuator.pojo.User;

import java.util.List;

/**
 * @author huangjie
 * @description
 * @date 2022-10-28
 */
public interface UserService {

    List<User> list();

}
