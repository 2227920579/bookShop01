package example.Dao;

import org.example.util.Util;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
/*
* 管理员查询图书状态类
* */
public class DaoBooksStatus {
    Util util = new Util();
    public void DaoBooksStatus() throws SQLException, ClassNotFoundException {
        Connection connection = util.getConnection();//获取链接
        try {
            PreparedStatement preparedStatement = connection.prepareStatement("select  * from books01.borrowing_record");
            ResultSet resultSet= preparedStatement.executeQuery();
            while (resultSet.next()){
                System.out.print(resultSet.getInt("id")+"\t");
                System.out.print(resultSet.getInt("Book_ID")+"\t");
                System.out.print(resultSet.getDate("Borrow_Date")+"\t");
                System.out.print(resultSet.getDate("Return_Date")+"\t");
                System.out.println("\n");
            }
        }catch (SQLException e){
            System.out.println("sql语法错误");

        }finally {
            util.closeConnection(connection);//关闭连接
        }
    }
}
