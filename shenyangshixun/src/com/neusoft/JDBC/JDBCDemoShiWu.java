package com.neusoft.JDBC;

import com.neusoft.JDBC.empselectDemo.domain2.utils.JDBCUtils;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * @author shihaobo
 * @date 2020/8/6 15:12
 */
public class JDBCDemoShiWu {
    public static void main(String[] args) throws SQLException {
        Connection comm = null;
        PreparedStatement pstmt = null;
        PreparedStatement pstmt2 = null;
        ResultSet rs = null;

        try {
            comm = JDBCUtils.getConnection();
            // 在此处开启事物
            comm.setAutoCommit(false);
            String sql = "update account set balance = balance - ? where id = ?";
            String sql2 = "update account set balance = balance + ? where id = ?";
            pstmt = comm.prepareStatement(sql);
            pstmt2 = comm.prepareStatement(sql2);
            // 设置参数
            pstmt.setInt(1,20000);
            pstmt.setInt(2,1);

            pstmt2.setInt(1,20000);
            pstmt2.setInt(2,2);

            int count = pstmt.executeUpdate();
            // 手动制造异常
//            int i = 5/0;
            int count2 = pstmt2.executeUpdate();
            System.out.println("count"+count+"  count2"+count2);

            // 提交事物
            comm.commit();

        }
        catch (Exception e) {
            // 事物进行回滚
           try {
               if (comm != null){
                   comm.rollback();
               }
           }catch (SQLException e1){
               e1.printStackTrace();
           }
            e.printStackTrace();
        }
        finally {
            JDBCUtils.close(pstmt,comm);
            JDBCUtils.close(pstmt2,comm);
        }
    }
}
