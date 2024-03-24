package org.example.Dao;

import org.example.Pojo.Admin;
import org.example.Pojo.User;
import org.example.util.Util;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
/*
* 用户注册
* */
public class Sign {
    Util util = new Util();


    public boolean UserSign(User user) throws SQLException, ClassNotFoundException {
        Connection connection = util.getConnection();//获取链接
        try {
            PreparedStatement preparedStatement = connection.prepareStatement("insert into books01.user (username, password) values (?,?)");
            preparedStatement.setString(1,user.getUsername());
            preparedStatement.setString(2,user.getPassword());
            int i = preparedStatement.executeUpdate();

            if (i>0) {
                return true;
            }else {
                return false;
            }
        } catch (SQLException e) {
            System.out.println("sql语法错误");
        } finally {
            util.closeConnection(connection);//关闭连接
            return false;
        }

    }

}
