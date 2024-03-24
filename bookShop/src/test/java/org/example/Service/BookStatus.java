package org.example.Service;

import org.example.Dao.DaoBooksStatus;

import java.sql.SQLException;
import java.util.Scanner;

/*
* 图书状态类
* */

public class BookStatus {
    DaoBooksStatus daoBooksStatus=new DaoBooksStatus();
    Scanner sc=new Scanner(System.in);
    public  boolean BookStatusFunction() throws SQLException, ClassNotFoundException {
        //直接调dao层方法

         daoBooksStatus.DaoBooksStatus();

        System.out.println(" 1.再次查询  2.返回登录界面");
        int flag=sc.nextInt();
        if(flag==1){
            return true;
        }else {
            return false;
        }

    }
}
