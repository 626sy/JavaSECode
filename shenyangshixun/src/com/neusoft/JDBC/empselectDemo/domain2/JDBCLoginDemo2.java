package com.neusoft.JDBC.empselectDemo.domain2;

import com.neusoft.JDBC.empselectDemo.domain2.utils.JDBCUtils;

import java.sql.*;
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
        PreparedStatement pstmt = null;
        ResultSet rs = null;
        try {
            comm = JDBCUtils.getConnection();
            String sql = "select * from user where username = ? and password = ?";
            System.out.println(sql);
            // 先获执行sql 的对象PreparedStatement
            pstmt = comm.prepareStatement(sql);
            // 给sql赋值
            pstmt.setString(1,username);
            pstmt.setString(2,password);
            // 执行查询，不需要传递sql
            rs = pstmt.executeQuery();
            return rs.next();

        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            JDBCUtils.close(pstmt,comm,rs);
        }

        return true;
    }
}
