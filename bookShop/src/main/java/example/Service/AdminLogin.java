package example.Service;

import example.Dao.DaoLogin;
import example.Pojo.Admin;

import java.sql.SQLException;
import java.util.Scanner;

/*
* 管理员登录类
* */

public class AdminLogin {
    Scanner sc=new Scanner(System.in);
    DaoLogin login=new DaoLogin();
    Admin admin=new Admin();
    public boolean AdminLoginFuction() throws SQLException, ClassNotFoundException {
        System.out.println("请输入用户名");
        admin.setAName( sc.next());
        System.out.println("请输入密码");
        admin.setAPwd(sc.next());
        //调用到dao层进行查询管理员表单
        boolean b =login.daoAdLogin(admin);
        if (b){
            System.out.println("登录成功");
            return true;
        }else {
            System.out.println("登录失败");
            return false;
        }


    }
}
