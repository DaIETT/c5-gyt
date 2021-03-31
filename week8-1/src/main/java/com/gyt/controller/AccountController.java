package com.gyt.controller;

import com.gyt.pojo.Account;
import com.gyt.service.accountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author Gyt
 * @create 2021-03-31 - 22:28
 */
@RestController
public class AccountController {


    @Autowired
    private accountService accountService;

    @RequestMapping("/all")
    public List<Account> findAll() {
        List<Account> all = accountService.findAll();

        return all;
    }

    @RequestMapping("/transfer")
    public String transfer() {
        accountService.transfer("2", "1", 1);

        return "转账Ok";
    }

}
