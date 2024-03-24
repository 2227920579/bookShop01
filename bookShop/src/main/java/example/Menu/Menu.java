package example.Menu;

import example.Service.*;

import java.sql.SQLException;
import java.util.Scanner;


/*
* 1菜单界面类，用户通过菜单界面选择功能
* 2菜单通过调用service层进行业务处理
* 3service层调用Dao层进行数据的持久化
* */
public class Menu {
    RetuenBook retuenBook=new RetuenBook();
    AdminLogin adminLogin=new AdminLogin();
    UserLogin userLogin=new UserLogin();
    BookStatus bookStatus=new BookStatus();
    CreateBooks createBooks = new CreateBooks();
    BorrowBook borrowBook = new BorrowBook();
    UserSign sign = new UserSign();
    Scanner sc = new Scanner(System.in);

    public void Sign() throws SQLException, ClassNotFoundException {
        System.out.println("****************请选择**************");
        System.out.println("1.用户登录  2.用户注册  3.管理员登录 4.退出系统");
        int i = sc.nextInt();
        switch (i) {
            case 1: {
               boolean b= userLogin.UserLoginFuction();

                if(b) {
                    BookUser();
                  /*  while (borrowBook.BorrowBookfunction()) {
                    }*/
                }else {
                    System.out.println("账户或密码错误，已返回主页面");
                    Sign();
                }
                  Sign();
                break;
            }
            case 2: {
                sign.UserSignFuction();
                Sign();
            }
            ;
            case 3: {
                boolean b= adminLogin.AdminLoginFuction();
                if(b) {
                    BookManage();
                }else {
                    System.out.println("账户或密码错误，请重新选择");
                    Sign();
                }
            }
            break;
            case 4:
            {
                System.exit(1);
            }
            default:
                System.out.println("输入非法，请重新选择");
                Sign();
        }
    }

    public  void  BookUser() throws SQLException, ClassNotFoundException {

        System.out.println("**************请选择*************");
        System.out.println("1.借阅图书  2.归还图书 3.返回主页");
        int i = sc.nextInt();
        switch (i){
            case 1:
                while (borrowBook.BorrowBookfunction()) {};
                break;
            case 2:
                while (retuenBook.RetuenBookFuction()){}
                break;
            case 3:Sign();
            default:
                System.out.println("输入非法，已返回主页");
        }

    }

    public void BookManage() throws SQLException, ClassNotFoundException {
        System.out.println("***********请选择********");
        System.out.println("1.新增图书  2.查询图书状态     3.返回主界面");
        int i = sc.nextInt();
        switch (i) {
            //调sever层  实现新增图书
            case 1: {
                while (createBooks.CreateBooksFunction()) ;
                BookManage();
                break;
            }
            case 2: {
                  //调用service层 输出全部图书状态
               while (bookStatus.BookStatusFunction());
               BookManage();
               break;
            }
            case 3:
                Sign();
                break;
            default:
                System.out.println("输入非法，重新输入");
                BookManage();
        }

    }

}
