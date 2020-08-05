package com.neusoft.JDBC.empselectDemo;

import com.neusoft.JDBC.empselectDemo.domain.Emp;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

/**
 * @author shihaobo
 * @date 2020/8/5 9:48
 */
public class JDBCemp {
    public static void main(String[] args) {
        // 定义一个方法 查询emp表中所有的值
        new JDBCemp().findAll();
    }

    public List<Emp> findAll(){
        Connection coon = null;
        Statement stmt = null;
        ResultSet rs = null;
        ArrayList<Emp> list = null;
        try {
            coon = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/java9", "root", "root");

//        4、定义sql
            String sql = "select * from emp;";
//        5、获取执行sql语句的对象 Statement
            stmt = coon.createStatement();
            // 封装查询结果
            rs = stmt.executeQuery(sql);
            list = new ArrayList<>();

            while (rs.next()){
                Emp emp = new Emp();
                emp.setId(rs.getInt(1));
                emp.setEname(rs.getString(2));
                emp.setJob(rs.getString(3));
                emp.setMgr(rs.getInt(4));
                emp.setHiredate(rs.getDate(5));
                emp.setSalary(rs.getInt(6));
                emp.setBonus(rs.getInt(7));
                emp.setDeptno(rs.getInt(8));
                list.add(emp);

            }

            System.out.print(list);

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

        return list;
    }
}
