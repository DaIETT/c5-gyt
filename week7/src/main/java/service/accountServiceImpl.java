package service;

import dao.accountDao;
import pojo.Account;
import utils.MybatisUtils;

import java.sql.Date;
import java.text.SimpleDateFormat;
import java.util.List;

/**
 * @author Gyt
 * @create 2021-03-21 - 23:07
 */


public class accountServiceImpl implements accountService {

    //这里用了Spring 来生成对象
    private accountDao accountDao = MybatisUtils.getSqlSession().getMapper(dao.accountDao.class);

    public List<Account> findAll() {
        List<Account> all = accountDao.findAll();
        return all;
    }

    public void deleteByPrimaryKey(String id) {
        accountDao.deleteByPrimaryKey(id);
    }

    public void insert(Account record) {
        accountDao.insert(record);
    }

    public Account selectByPrimaryKey(String id) {
        return accountDao.selectByPrimaryKey(id);
    }

    public void updateByPrimaryKey(Account record) {
        accountDao.updateByPrimaryKey(record);
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

        accountDao.updateByPrimaryKey(remitter);
        accountDao.updateByPrimaryKey(remittee);

    }
}
