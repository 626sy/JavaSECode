package com.neusoft.JDBC.empselectDemo.domain2;

import java.util.Scanner;

/**
 * @author shihaobo
 * @date 2020/8/6 11:47
 */
public class JDBCLoginDemo2 {
    public static void main(String[] args) {
        Scanner sc1 = new Scanner(System.in);
        System.out.println("请输入用户名");
        String userName = sc1.nextLine();
        System.out.println("请输入密码");
        String passWord = sc1.nextLine();
        new JDBCLoginDemo2().login()
    }
    public boolean login(String username,String password){

        return true;
    }
}
