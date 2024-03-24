package org.example.Dao;

import org.example.Pojo.BorrowingRecord;
import org.example.util.Util;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
/*
* 插入用户借阅信息
* */
public class DaoBorrowingDate {
    int Id;
    BorrowingRecord borrowingRecord=new BorrowingRecord();
    Util util = new Util();
    java.util.Date utilDate = new java.util.Date();
    java.sql.Date sqlDate = new java.sql.Date(utilDate.getTime());

    public void DaoBorrowingDateFunction(BorrowingRecord borrowingRecord) throws SQLException, ClassNotFoundException {
        Connection connection = util.getConnection();//获取链接

        try {
            PreparedStatement preparedStatement = connection.prepareStatement("select max(id) from books01.borrowing_record ");
            ResultSet resultSets= preparedStatement.executeQuery();
            while (resultSets.next()){
                Id=resultSets.getInt("max(id)");
                Id++;
            }
             preparedStatement = connection.prepareStatement("insert into books01.borrowing_record  (id, Book_ID, Borrow_Date) values (?,?,?)");
            preparedStatement.setInt(1,Id );
            preparedStatement.setInt(2, borrowingRecord.getBook_ID());
            preparedStatement.setDate(3, sqlDate);
            int resultSet= preparedStatement.executeUpdate();
            if (resultSet>0){
                System.out.println("图书记录已更新");
            }else {
                System.out.println("图书记录更新失败");
            }

        } catch (SQLException e) {
            System.out.println("sql语法错误");
        } finally {
            util.closeConnection(connection);//关闭连接
        }
    }
}
