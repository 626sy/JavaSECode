package com.neusoft.JDBC;

import javax.swing.plaf.nimbus.State;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * @author shihaobo
 * @date 2020/8/4 17:00
 */
public class JDBCDemo3 {
    public static void main(String[] args) throws Exception {



        Connection coon = null;
        Statement stmt = null;



        try {
             coon = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/java9", "root", "root");
            System.out.println(coon);
//        4、定义sql
//        String sql = "update account set balance = 20050 where id = 5";
            String sql = "insert into account values (null ,'赵四',5000)";
//        5、获取执行sql语句的对象 Statement
             stmt = coon.createStatement();
//        6、执行sql，接受返回结果
            int count = stmt.executeUpdate(sql);// 返回受影响的行数
//        7、处理结果JDBCDemo2
            if (count>0){
                System.out.println("添加成功");
            }else {
                System.out.println("添加失败");
            }
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
            coon.close();
        }

    }
}
