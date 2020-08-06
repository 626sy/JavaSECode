package com.neusoft.JDBC.empselectDemo.domain2;

import com.neusoft.JDBC.empselectDemo.domain2.utils.JDBCUtils;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

/**
 * @author shihaobo
 * @date 2020/8/5 11:05
 */
public class JDBCEmp2 {
    public static void main(String[] args) {
//        List<Emp2> findall = new JDBCEmp2().findall();
//        for (Emp2 emp2 : findall) {
//            System.out.println(emp2);
//        }

        List<Emp2> emp2s = new JDBCEmp2().finaallJDBCUtils();
        for(Emp2 emp2 : emp2s){
            System.out.println(emp2);
        }
    }

    public List<Emp2> findall() {
        Connection conn = null;
        Statement stmt = null;
        ResultSet rs = null;
        ArrayList<Emp2> list = null;
        try {
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/java9", "root", "root");
            String sql = "select * from emp;";
            stmt = conn.createStatement();
            rs = stmt.executeQuery(sql);
            list = new ArrayList<>();
            while (rs.next()) {
                int empno = rs.getInt("empno");
                String ename = rs.getString("ename");
                String job = rs.getString("job");
                int mgr = rs.getInt("mgr");
                Date hiredate = rs.getDate("hiredate");
                int sal = rs.getInt("sal");
                int comm = rs.getInt("comm");
                int deptno = rs.getInt("deptno");
                Emp2 emp2 = new Emp2();
                emp2.setId(empno);
                emp2.setEname(ename);
                emp2.setJob(job);
                emp2.setMgr(mgr);
                emp2.setHiredate(hiredate);
                emp2.setSalary(sal);
                emp2.setBonus(comm);
                emp2.setDeptno(deptno);
                list.add(emp2);
            }

        } catch (ClassCastException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            if (stmt != null) {
                try {
                    stmt.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
            if (rs != null) {
                try {
                    rs.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
            if (conn != null) {
                try {
                    conn.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }

        }
        return list;
    }

    // 演示JDBCUtils
    public List<Emp2> finaallJDBCUtils() {
        Connection conn = null;
        Statement stmt = null;
        ResultSet rs = null;
        ArrayList<Emp2> list = null;
        try {
            conn = JDBCUtils.getConnection();
            String sql = "select * from emp;";
            stmt = conn.createStatement();
            rs = stmt.executeQuery(sql);
            list = new ArrayList<>();
            while (rs.next()) {
                int empno = rs.getInt("empno");
                String ename = rs.getString("ename");
                String job = rs.getString("job");
                int mgr = rs.getInt("mgr");
                Date hiredate = rs.getDate("hiredate");
                int sal = rs.getInt("sal");
                int comm = rs.getInt("comm");
                int deptno = rs.getInt("deptno");
                Emp2 emp2 = new Emp2();
                emp2.setId(empno);
                emp2.setEname(ename);
                emp2.setJob(job);
                emp2.setMgr(mgr);
                emp2.setHiredate(hiredate);
                emp2.setSalary(sal);
                emp2.setBonus(comm);
                emp2.setDeptno(deptno);
                list.add(emp2);

            }
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (ClassCastException e){
            e.printStackTrace();
        }finally {
            JDBCUtils.close(stmt,conn,rs);
        }
        return list;
    }
}
