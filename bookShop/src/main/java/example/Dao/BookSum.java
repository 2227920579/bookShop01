package example.Dao;

import example.util.Util;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/*
* 持久层图书借阅类
* */

public class BookSum {
    Util util = new Util();
    public void BookSumFunction(int id) throws SQLException, ClassNotFoundException {
        Connection connection = util.getConnection();//获取链接
        try {
            PreparedStatement preparedStatement = connection.prepareStatement("select * from books01.bookinfo where Book_ID=?");
           preparedStatement.setInt(1,id);
            ResultSet resultSet= preparedStatement.executeQuery();
           if(resultSet.next()&&resultSet.getInt("Available")!=0){
               resultSet.getInt("Available");
                preparedStatement = connection.prepareStatement("update books01.bookinfo set Available =? where Book_ID=?");
                preparedStatement.setInt(1,0);
                preparedStatement.setInt(2,id);
                preparedStatement.executeUpdate();
                System.out.println("借阅成功:)");
            }else {
                System.out.println("图书已被借阅，请重新选择");
            }


        }catch (SQLException e){
            System.out.println("sql语句错误");
        }
        finally {
            util.closeConnection(connection);//关闭连接

        }
    }
}
