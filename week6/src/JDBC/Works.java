package JDBC;

import JDBC.pojo.Student;
import JDBC.utils.MyUtils;
import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanListHandler;
import org.junit.Test;

import java.sql.Connection;
import java.util.List;

/**
 * @author Gyt
 * @create 2021-03-17-8:56
 */
public class Works {

    /**
     * 1.插入如下数据
     * ('s001','老大',20,'计算机学院')
     * ('s002','老二',19,'计算机学院')
     * ('s003','老三',18,'计算机学院')
     * ('s004','老四',17,'计算机学院')
     * @throws Exception
     */
    @Test
    public void insert() throws Exception{
        QueryRunner runner = new QueryRunner();
        Connection connection =
                MyUtils.getConnection();

        String sql = "insert into homework.student2(SNO,Name,Age,College)" +
                "values(?,?,?,?)";

        runner.update(connection,sql,"s001","老大",20,"计算机学院");
        runner.update(connection,sql,"s002","老二",19,"计算机学院");
        runner.update(connection,sql,"s003","老三",18,"计算机学院");
        runner.update(connection,sql,"s004","老四",17,"计算机学院");

        System.out.println();


        connection.close();
    }

    /**
     * 2.查看表中的所有信息，遍历输出到控制台
     *
     * @throws Exception
     */
    @Test
    public void queryStudents() throws Exception{
        QueryRunner runner = new QueryRunner();
        Connection connection =
                MyUtils.getConnection();

        String sql = "select SNO,Name,Age,college from homework.student2";

        BeanListHandler<Student> studentBeanListHandler = new BeanListHandler<>(Student.class);

        List<Student> students= runner.query(connection,sql,studentBeanListHandler);

        students.forEach(System.out::println);

        connection.close();
    }

    /**
     * 3.把sno为s004的记录删除
     * @throws Exception
     */
    @Test
    public void delete() throws Exception{
        QueryRunner runner = new QueryRunner();
        Connection connection =
                MyUtils.getConnection();

        String sql = "delete from homework.student2 where SNO = ?";

        runner.update(connection,sql,"s004");

        connection.close();
    }

    /**
     *4.查询sno为s003的记录
     * @throws Exception
     */
    @Test
    public void queryStudentBySNO() throws Exception{
        QueryRunner runner = new QueryRunner();
        Connection connection =
                MyUtils.getConnection();

        String sql = "select * from homework.student2 where SNO = ?";
        BeanListHandler<Student> studentBeanListHandler = new BeanListHandler<>(Student.class);

        List<Student> students = runner.query(connection, sql, studentBeanListHandler, "s003");

        students.forEach(System.out::println);

        connection.close();
    }

    /**
     * 5.把sno为s001的记录修改为('s001','老大',20,'通信学院')
     * @throws Exception
     */
    @Test
    public void update() throws Exception{
        QueryRunner runner = new QueryRunner();
        Connection connection =
                MyUtils.getConnection();

        String sql = "update homework.student2 set `College` = ? where SNO = ?";

        runner.update(connection,sql,"通信学院","s001");

        connection.close();
    }
}
