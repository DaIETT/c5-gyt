package utils;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;

/**
 * @author Gyt
 * @create 2021-03-06 - 12:18
 */

//sqlSessionFactory用于获取 sqlSession
public class MybatisUtils {

    //这一步叫做提升作用域 妙啊
    private static  SqlSessionFactory  sqlSessionFactory;

    static {

        try {

            //获取sqlSessionFactory对象
            String resource = "mybatis-config.xml";
            InputStream inputStream = Resources.getResourceAsStream(resource);
            //SqlSessionFactoryBuilder 用于建造工厂
            //sqlSessionFactory 用于生产 sqlSession
            sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    //获取sqlSession
    public static SqlSession getSqlSession() {
        return sqlSessionFactory.openSession(true);
    }


}
