package com.neusoft.JDBC;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.Statement;

import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * @author shihaobo
 * @date 2020/8/5 9:20
 */
public class jdbcdemotest {
    public static void main(String[] args) throws Exception {
        Connection coon =null;
        Statement  stmt = null;
        try {
            coon = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/java9","root","root");
            System.out.println(coon);
            String sql = "update account set name='张三' where id=6";
            stmt = (Statement) coon.createStatement();
            int count = stmt.executeUpdate(sql);
            if (count>0){
                System.out.println("删除成功");
            }else {
                System.out.println("删除失败");
            }
        }catch (ClassCastException e){
            e.printStackTrace();

        }catch (SQLException e){
            e.printStackTrace();
        }finally {
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
