package org.example.Service;

import com.sun.scenario.effect.impl.sw.java.JSWBlend_SRC_OUTPeer;
import org.example.Dao.DaoReturnBook;
import org.example.Pojo.Books;
import org.example.Pojo.BorrowingRecord;

import java.sql.SQLException;
import java.util.Scanner;

/*
* 用户还书类
* */
public class RetuenBook {
    DaoReturnBook returnBook=new DaoReturnBook();
    Scanner sc=new Scanner(System.in);
    Books books=new Books();
    public boolean RetuenBookFuction() throws SQLException, ClassNotFoundException {
        System.out.println("请输入你要归还的图书编号");
        books.setBook_ID(sc.nextInt());

        returnBook.DaoReturnBookFunction(books);


        System.out.println("1.继续归还  2.返回用户界面");
        int flag=sc.nextInt();
        if (flag==1){
            return  true;
        }else {
            return false;
        }

    }
}
