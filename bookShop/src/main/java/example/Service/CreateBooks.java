package example.Service;

import org.example.Dao.DaocreateBooks;
import org.example.Pojo.Books;

import java.sql.SQLException;
import java.util.Scanner;

/*
* 管理员插入图书类
* */

public class CreateBooks {
    DaocreateBooks daocreateBooks=new DaocreateBooks();
    Scanner sc=new Scanner(System.in);
    Books book=new Books();
    public Boolean CreateBooksFunction() throws SQLException, ClassNotFoundException {
        System.out.println("请输入图书的 编号  名称  出版社  图书状态 ");

        book.setBook_ID(sc.nextInt());
        book.setTitle(sc.next());
        book.setAuthor(sc.next());
        book.setAvailable(sc.nextInt());
        //调用Dao层方法把book对象传入

        daocreateBooks.DaocreatBooksFunction(book);



        System.out.println("1.继续新增  2.返回管理员页面");
        int flag=sc.nextInt();
        if (flag==1){
           return  true;
        }else {
            return false;
        }

    }
}
