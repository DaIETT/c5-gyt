package com.gyt.service;

import com.gyt.mapper.AccountMapper;
import com.gyt.pojo.Account;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.Date;
import java.text.SimpleDateFormat;
import java.util.List;

/**
 * @author Gyt
 * @create 2021-03-21 - 23:07
 */


@Service
public class accountServiceImpl implements accountService {

    @Autowired
    private AccountMapper accountMapper;

    public List<Account> findAll() {
        List<Account> all = accountMapper.findAll();
        return all;
    }

    public void deleteByPrimaryKey(String id) {
        accountMapper.deleteByPrimaryKey(id);
    }

    public void insert(Account record) {
        accountMapper.insert(record);
    }

    public Account selectByPrimaryKey(String id) {
        return accountMapper.selectByPrimaryKey(id);
    }

    public void updateByPrimaryKey(Account record) {
        accountMapper.updateByPrimaryKey(record);
    }

    /**
     * 该事务由上面的事务完成
     *
     * @param remitterId 汇款人编号
     * @param remitteeId 收款人编号
     * @param money      汇款数额
     */
    public void transfer(String remitterId, String remitteeId, int money) {
        Account remitter = selectByPrimaryKey(remitterId);
        Account remittee = selectByPrimaryKey(remitteeId);

        if (money < 0) {
            System.out.println("汇款失败 汇款金额无效");
            return;
        }

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        Date date = new Date(System.currentTimeMillis());

        remitter.setMoney(remitter.getMoney() - money);
        remitter.setUpdatetime(date);

        remittee.setMoney(remittee.getMoney() + money);
        remittee.setUpdatetime(date);

        accountMapper.updateByPrimaryKey(remitter);
        accountMapper.updateByPrimaryKey(remittee);

    }
}
