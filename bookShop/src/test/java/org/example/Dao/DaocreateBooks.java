package org.example.Dao;

import org.example.Pojo.Books;
import org.example.util.Util;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
/*
* 管理员新增图书
* */
public class DaocreateBooks {

    Books books=new Books();
    Util util = new Util();
    public void DaocreatBooksFunction(Books book) throws SQLException, ClassNotFoundException {
        Connection connection = util.getConnection();//获取链接
        try {
            PreparedStatement preparedStatement = connection.prepareStatement("insert into books01.bookinfo values (?,?,?,?)");
            preparedStatement.setInt(1, book.getBook_ID());
            preparedStatement.setString(2, book.getTitle());
            preparedStatement.setString(3, book.getAuthor());
            preparedStatement.setInt(4, book.getAvailable());
            int i= preparedStatement.executeUpdate();
            if(i>0){
                System.out.println("新增成功");
            }else {
                System.out.println("新增失败");
            }
        }catch (SQLException e){
            System.out.println("sql语句错误");
        }finally {
            util.closeConnection(connection);//关闭连接
        }
    }
}
