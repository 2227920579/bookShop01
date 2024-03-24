package example.Service;

import org.example.Dao.BookSum;
import org.example.Dao.DaoBorrowingDate;
import org.example.Dao.SelectBooks;
import org.example.Pojo.BorrowingRecord;

import java.sql.Date;
import java.sql.SQLException;
import java.util.Scanner;

/*
* 借阅图书类
* */
public class BorrowBook {


    BorrowingRecord borrowingRecord=new BorrowingRecord();
    DaoBorrowingDate daoBorrowingDate=new DaoBorrowingDate();
    BookSum bookSum=new BookSum();
    SelectBooks selectBooks=new SelectBooks();
    Scanner sc=new Scanner(System.in);
    public boolean BorrowBookfunction() throws SQLException, ClassNotFoundException {
        java.util.Date utilDate = new java.util.Date();

        Date sqlDate = new Date(utilDate.getTime());
        //查询所有图书
        selectBooks.selectBooksFunction();
        System.out.println("请选择你要借的图书");
        int i= sc.nextInt();


        //根据i修改图书状态
        bookSum.BookSumFunction(i);



        //根据i新增图书借阅记录
        borrowingRecord.setBook_ID(i);
        daoBorrowingDate.DaoBorrowingDateFunction(borrowingRecord);



        System.out.println("1.继续借阅  2.返回登录界面");
         int flag=sc.nextInt();
         if(flag==1){
             return true;
         }else {
             return false;
         }
    }
}
