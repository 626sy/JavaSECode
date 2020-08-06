package com.neusoft.JDBC;

import com.neusoft.JDBC.empselectDemo.domain2.utils.JDBCUtils;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * @author shihaobo
 * @date 2020/8/6 14:42
 */
public class JDBCDemoSql {
    public static void main(String[] args) {
    Connection comm = null;
    PreparedStatement pstmt = null;
    PreparedStatement pstmt2 = null;
    ResultSet rs = null;

    try {
        comm = JDBCUtils.getConnection();

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
        int count2 = pstmt2.executeUpdate();
        System.out.println("count"+count+"  count2"+count2);

    } catch (SQLException e) {
        e.printStackTrace();
    }finally {
        JDBCUtils.close(pstmt,comm);
        JDBCUtils.close(pstmt2,comm);
    }
}
}
