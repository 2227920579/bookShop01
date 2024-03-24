package org.example.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


/*
* Util工具类
*
* */
public class Util {
    private static final String DRIVER="com.mysql.jdbc.Driver";
    private static final String DB_URL="jdbc:mysql://localhost:3306/books01?useSSL=false";
    private static final String USER="root";
    private static final String PASSWORD="12345";

    // 获取数据库链接
    public   Connection getConnection() throws ClassNotFoundException, SQLException {
        Class.forName(DRIVER);
        // Connection connection= DriverManager.getConnection(DB_URL,USER,PASSWORD);
        // return connection;
        return DriverManager.getConnection(DB_URL,USER,PASSWORD);
    }
    //释放资源封装
    // 利用可变参数  参数类型。。。变量名
    public  void closeConnection(Connection connection) {
        if (connection != null) {
            try {
                connection.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}
