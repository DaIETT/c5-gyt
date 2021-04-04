package com.gyt.controller;

import com.gyt.pojo.User;
import com.gyt.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author Gyt
 * @create 2021-04-04 - 14:48
 */

@Controller
public class TestController {

    @Autowired
    private UserService userService;

    @ResponseBody
    @RequestMapping("/getUserById")
    public User getUserById() {
        User byId = userService.findById(1);

        return byId;
    }

}
