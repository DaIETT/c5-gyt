package dao;

import junit.framework.TestCase;
import org.apache.ibatis.session.SqlSession;
import pojo.Account;
import utils.MybatisUtils;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.sql.Date;
import java.util.List;

/**
 * @author Gyt
 * @create 2021-03-21 - 23:25
 */
public class accountDaoTest extends TestCase {

    SqlSession session = MybatisUtils.getSqlSession();
    accountDao mapper = session.getMapper(accountDao.class);

    public void testFindAll() {
        List<Account> all = mapper.findAll();
        for (Account account : all) {
            System.out.println(account);
        }
    }

    public void testDeleteByPrimaryKey() {

    }

    public void testInsert() throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
//        String date = sdf.format(new Date());
        Date date = new Date(System.currentTimeMillis());
        Account account1 = new Account("1", "jack", 1000, date, null);
        Account account2 = new Account("2", "tom", 500, date, null);
        Account account3 = new Account("3", "micky", 800, date, null);
        mapper.insert(account1);
        mapper.insert(account2);
        mapper.insert(account3);



    }

    public void testSelectByPrimaryKey() {
    }

    public void testUpdateByPrimaryKey() {
    }
}