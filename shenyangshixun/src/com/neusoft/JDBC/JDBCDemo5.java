package com.neusoft.JDBC;

import java.sql.*;

/**
 * @author shihaobo
 * @date 2020/8/4 17:00
 */
public class JDBCDemo5 {
    // 查询
    public static void main(String[] args) throws Exception {
        Connection coon = null;
        Statement stmt = null;
        ResultSet rs = null;
        try {
             coon = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/java9", "root", "root");

//        4、定义sql
            String sql = "select * from account;";
//        5、获取执行sql语句的对象 Statement
             stmt = coon.createStatement();
            // 封装查询结果
            rs = stmt.executeQuery(sql);
            while (rs.next()){
                int id = rs.getInt(1);
                String name = rs.getString("name");
                int balance = rs.getInt(3);
                System.out.println("id"+id+"name"+name+"balance"+balance);
            }


            rs = stmt.executeQuery(sql);
            rs.next();
            int id2 = rs.getInt(1);
            String name2 = rs.getString("name");
            int balance2 = rs.getInt(3);
            System.out.println("id"+id2+"name"+name2+"balance"+balance2);


        }catch (ClassCastException e){
            e.printStackTrace();
        }catch (SQLException e){
            e.printStackTrace();
        }finally {
            // 释放资源
            if (stmt!=null){
                try {
                    stmt.close();
                }catch (SQLException e){
                    e.printStackTrace();
                }
            }
            if (rs!=null){
                try {
                    coon.close();
                }catch (SQLException e){
                    e.printStackTrace();
                }
            }
        }

    }
}
