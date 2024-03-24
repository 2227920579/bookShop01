package example.Service;

import org.example.Dao.Sign;
import org.example.Pojo.User;

import java.sql.SQLException;
import java.util.Scanner;


/*
* 用户注册类
* */
public class UserSign {
    Sign sign= new Sign();
    Scanner sc=new Scanner(System.in);
    User user=new User();
    public void UserSignFuction() throws SQLException, ClassNotFoundException {
        System.out.println("请输入用户名");
       user.setUsername( sc.next());
        System.out.println("请输入密码");
        user.setPassword(sc.next());

        //调用Dao层方法进行插入操作
        sign.UserSign(user);


        System.out.println("用户注册成功");


    }
}
