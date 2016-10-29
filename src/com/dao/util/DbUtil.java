package com.dao.util;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

/**
 * Created by AlvinOdins on 10/28/2016.
 */
public class DbUtil {

    private static Connection con;
    //private static ResourceBundle res = ResourceBundle.getBundle("driver.properties");

    public static Connection getConnection() {
        if (con != null)
            return con;

        InputStream inputStream = DbUtil.class.getClassLoader().getResourceAsStream("/driver.properties");
        Properties properties = new Properties();

        try {
            properties.load(inputStream);
            String driver = properties.getProperty("driver");
            String url = properties.getProperty("url");
            String user = properties.getProperty("user");
            String password = properties.getProperty("password");
            Class.forName(driver);
            con = DriverManager.getConnection(url, user, password);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return con;
    }


}
