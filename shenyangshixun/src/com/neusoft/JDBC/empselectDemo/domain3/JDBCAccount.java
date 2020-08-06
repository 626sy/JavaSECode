package com.neusoft.JDBC.empselectDemo.domain3;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

/**
 * @author shihaobo
 * @date 2020/8/6 8:27
 */
public class JDBCAccount {
    public static void main(String[] args) {
        List<Account> finall = new JDBCAccount().finall();
        for(Account acc:finall){
            System.out.println(acc);
        }
    }
    public List<Account> finall(){
        Connection conn = null;
        Statement stmt = null;
        ResultSet rs = null;
        ArrayList<Account> list = new ArrayList<>();
        try {
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/java9","root","root");
            String sql = "select * from account;";
            stmt = conn.createStatement();
            rs = stmt.executeQuery(sql);

            while (rs.next()){
                int id = rs.getInt("id");
                String name = rs.getString("name");
                int balance = rs.getInt("balance");
                Account account = new Account();
                account.setId(id);
                account.setBalance(balance);
                account.setName(name);
                list.add(account);
            }

        }catch (ClassCastException e){
            e.printStackTrace();
        }catch (SQLException e){
            e.printStackTrace();
        }finally {
            if (conn!=null){
                try {
                    conn.close();
                }catch (SQLException e){
                    e.printStackTrace();
                }
            }
            if (stmt!=null){
                try {
                    stmt.close();
                }catch (SQLException e){
                    e.printStackTrace();
                }
            }
            if (rs!=null){
                try {
                    rs.close();
                }catch (SQLException e){
                    e.printStackTrace();
                }
            }
        }
        return list;
    }
}
