package example.Dao;

import org.example.Pojo.Books;
import org.example.Pojo.BorrowingRecord;
import org.example.util.Util;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
/*
* 用户归还图书向数据库更改归还时间，并更改图书状态
* */

public class DaoReturnBook {
    java.util.Date utilDate = new java.util.Date();
    java.sql.Date sqlDate = new java.sql.Date(utilDate.getTime());
    BorrowingRecord borrowingRecord=new BorrowingRecord();
    Util util = new Util();
    public void DaoReturnBookFunction(Books borrowingRecord) throws SQLException, ClassNotFoundException {
        Connection connection = util.getConnection();//获取链接

        try{
          PreparedStatement preparedStatement = connection.prepareStatement("update books01.borrowing_record set Return_Date =?  where Book_ID=?");
          preparedStatement.setDate(1,sqlDate);
          preparedStatement.setInt(2,borrowingRecord.getBook_ID());
          int i= preparedStatement.executeUpdate();
          if(i>0){
              System.out.println("图书归还成功");
          }else {
              System.out.println("图书归还失败");
          }
             preparedStatement = connection.prepareStatement("update books01.bookinfo set Available =1  where Book_ID=?");
            preparedStatement.setInt(1,borrowingRecord.getBook_ID());
            int f= preparedStatement.executeUpdate();
            if(f>0) {
                System.out.println("图书状态码已修改");
            }else {
                System.out.println("图书状态更改失败");
            }
        }catch (SQLException e){
            System.out.println("sql语法错误");
        }finally {
            util.closeConnection(connection);//关闭连接
        }

    }
}
