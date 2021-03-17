package JDBC.utils;

import com.alibaba.druid.pool.DruidDataSourceFactory;
import org.apache.commons.dbcp.BasicDataSourceFactory;

import javax.sql.DataSource;
import java.io.File;
import java.io.FileInputStream;
import java.sql.Connection;
import java.util.Properties;

/**
 * @author Gyt
 * @create 2021-03-17-8:49
 */
public class MyUtils {

    private static DataSource source;

    static {
        // 加载配置
        Properties properties = new Properties();

        try {
            FileInputStream inStream = new FileInputStream(new File("src/JDBC/resources/druid.properties"));
            properties.load(inStream);
            // 创建了DBCP数据库连接池
            source = DruidDataSourceFactory.createDataSource(properties);

        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

    }

    public static Connection getConnection() throws Exception {

        Connection connection = source.getConnection();
        return connection;
    }

}
