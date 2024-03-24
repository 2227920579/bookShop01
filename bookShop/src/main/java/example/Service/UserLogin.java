package example.Service;

import org.example.Dao.DaoLogin;
import org.example.Pojo.User;

import java.sql.SQLException;
import java.util.Scanner;

/*
*
* */
public class UserLogin {
    DaoLogin daoLogin=new DaoLogin();
    Scanner sc=new Scanner(System.in);
    User user=new User();
    public boolean UserLoginFuction() throws SQLException, ClassNotFoundException {
        System.out.println("请输入用户名");
        user.setUsername( sc.next());
        System.out.println("请输入密码");
        user.setPassword(sc.next());
        //调用到dao层进行查询用户表单
       boolean b =daoLogin.daoUserLogin(user);
        if (b){
            System.out.println("登录成功");
            return true;
        }else {
            System.out.println("登录失败");
            return false;
        }

    }
}