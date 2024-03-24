package org.example.Dao;

import org.example.Pojo.User;
import org.example.util.Util;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class SelectBooks {
    Util util = new Util();


    public void selectBooksFunction() throws SQLException, ClassNotFoundException {
        Connection connection = util.getConnection();//获取链接
        try {
            PreparedStatement preparedStatement = connection.prepareStatement("select * from books01.bookinfo");

            ResultSet resultSet = preparedStatement.executeQuery();
            System.out.println("图书id 书名 出版社 图书数量");
            while (resultSet.next()){

                System.out.print(resultSet.getString("Book_ID")+"\t");
                System.out.print(resultSet.getString("Title")+"\t");
                System.out.print(resultSet.getString("Author")+"\t");
                System.out.print(resultSet.getInt("Available")+"\t");
                System.out.println("\n");
            }


        } catch (SQLException e) {
            System.out.println("sql语法错误");
        } finally {
            util.closeConnection(connection);//关闭连接

        }

    }
}
