package com.neusoft.JDBC.empselectDemo.domain2;

import com.neusoft.JDBC.empselectDemo.domain2.utils.JDBCUtils;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
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
        boolean flag = new JDBCLoginDemo2().login(userName, passWord);
        if (flag){
            System.out.println("登录成功");
        }else {
            System.out.println("用户名或密码错误");
        }
    }
    public boolean login(String username,String password){
        if(username == null || password == null){
            return false;
        }
        Connection comm = null;
        Statement stmt = null;
        ResultSet rs = null;
        try {
            comm = JDBCUtils.getConnection();
            String sql = "select * from  user where username = '"+username+"' and password = '"+password+"';";
            System.out.println(sql);
            stmt = comm.createStatement();
            rs = stmt.executeQuery(sql);
            return rs.next();

        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            JDBCUtils.close(stmt,comm,rs);
        }

        return true;
    }
}
