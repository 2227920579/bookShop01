package org.example.Dao;

import org.example.Pojo.Admin;
import org.example.Pojo.User;
import org.example.util.Util;
import org.junit.Test;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/*
 * 登录数据库操作，
 * （1）：获取控制台账号密码，
 * （2）：查询数据库，
 * （3）：向 service层返回查询结果，
 * */
public class DaoLogin {
    Util util = new Util();
    public boolean daoAdLogin(Admin admin) throws SQLException, ClassNotFoundException {
        Connection connection = util.getConnection();//获取链接
        ResultSet resultSet = null;
        try {
            PreparedStatement preparedStatement = connection.prepareStatement("select * from books01.user where username=? and   password=?");//调用prepareStatement方法执行sql
            preparedStatement.setString(1, admin.getAName());
            preparedStatement.setString(2, admin.getAPwd());
            resultSet = preparedStatement.executeQuery();

        } catch (SQLException e) {
            System.out.println("sql语法错误");
        } finally {
            if (resultSet.next()) {
                util.closeConnection(connection);//关闭连接
                return true;
            } else {
                util.closeConnection(connection);//关闭连接
                return false;
            }

        }

    }
    public boolean daoUserLogin(User user) throws SQLException, ClassNotFoundException {
        Connection connection = util.getConnection();//获取链接
        ResultSet resultSet = null;
        try {
            PreparedStatement preparedStatement = connection.prepareStatement("select * from books01.user where username=? and   password=?");//调用prepareStatement方法执行sql
            preparedStatement.setString(1, user.getUsername());
            preparedStatement.setString(2, user.getPassword());
            resultSet = preparedStatement.executeQuery();

        } catch (SQLException e) {
            System.out.println("sql语法错误");
        } finally {

            if (resultSet.next()){
                util.closeConnection(connection);//关闭连接
                return true;
            }else {
                util.closeConnection(connection);//关闭连接
                return false;
            }


        }


    }
}
