package com.gyt.service;

import com.gyt.mapper.UserMapper;
import com.gyt.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author Gyt
 * @create 2021-04-04 - 14:04
 */

@Service
public class UserService {

    @Autowired
    private UserMapper userMapper;

    public void register(User user) {
        userMapper.register(user);
    }

    public boolean login(String mobile, String password) {
        User user = userMapper.login(mobile, password);
        if (user == null) {
            return false;
        } else {
            return true;
        }
    }

    //查询用户信息
    public User findById(int id) {
        //调用 dao 层的方法
        return userMapper.findById(id);
    }


}
