package service;

import junit.framework.TestCase;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;
import pojo.Account;
import utils.MybatisUtils;

import java.util.List;

/**
 * @author Gyt
 * @create 2021-03-21 - 23:19
 */
public class accountServiceTest {
    accountService accountService = new accountServiceImpl();


    //查询
    @Test
    public void testFindAll() {
        List<Account> all = accountService.findAll();
        for (Account account : all) {
            System.out.println(account);
        }
    }

    //转账
    @Test
    public void testTransfer() {
        accountService.transfer("2", "1", 1);

    }
}