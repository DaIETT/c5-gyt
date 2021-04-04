package com.gyt.mapper;

import com.gyt.pojo.User;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

/**
 * @author Gyt
 * @create 2021-04-04 - 13:46
 */

@Mapper
@Repository
public interface UserMapper {
    //用户注册
    void register(User user);

    //用户登录
    User login(String mobile, String password);

    //查询用户信息
    User findById(int id);
}
