package com.tt.util;


import com.alibaba.druid.pool.DruidDataSourceFactory;
import javax.sql.DataSource;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.Properties;

/**
 * @author edz
 */
public class C3p0_Util {


    static FileInputStream fis = null;

    public static DataSource dataSource;

    static {

        try {

            fis = new FileInputStream("src/driud.properties");
            Properties p = new Properties();
            p.load(fis);
            dataSource = DruidDataSourceFactory.createDataSource(p);

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static Connection getCon() {
        try {
            return dataSource.getConnection();
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return null;


    }
}
