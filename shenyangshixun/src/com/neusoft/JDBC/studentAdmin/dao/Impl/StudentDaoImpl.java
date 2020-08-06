package com.neusoft.JDBC.studentAdmin.dao.Impl;

import com.neusoft.JDBC.studentAdmin.dao.StudentDao;
import com.neusoft.JDBC.studentAdmin.domain.Student;
import com.neusoft.JDBC.studentAdmin.utils.JDBCUtils;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

/**
 * @author shihaobo
 * @date 2020/8/6 15:59
 */
public class StudentDaoImpl implements StudentDao {
    @Override
    public List<Student> findAll() {
        Connection conn = null;
        Statement stmt = null;
        ResultSet rs = null;
        ArrayList<Student> list = null;
        try {
            conn = JDBCUtils.getConnection();
            String sql = "select * from studentManage;";
            stmt = conn.createStatement();
            rs = stmt.executeQuery(sql);
            list = new ArrayList<>();
            while (rs.next()){
                int id = rs.getInt("id");
                String name = rs.getString("name");
                String gender = rs.getString("gender");
                int score = rs.getInt("score");
                String addr = rs.getString("addr");
                String tel = rs.getString("tel");
                Student student = new Student();
                student.setId(id);
                student.setName(name);
                student.setGender(gender);
                student.setScore(score);
                student.setAddress(addr);
                student.setPhone(tel);
                list.add(student);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }catch (ClassCastException e){
            e.printStackTrace();
        }finally {
            JDBCUtils.close(stmt,conn,rs);
        }


        return list;
    }

    @Override
    public void save(Student student) {
        Student student1 = new Student();
        Connection conn = null;
        PreparedStatement pstmt = null;
        ArrayList<Student> list = null;

        try {
            conn = JDBCUtils.getConnection();
            String sql = "insert into studentManage values(?,?,?,?,?,?)";
//            pstmt = conn.prepareStatement(sql);
//            pstmt.setInt(1,1);
//            pstmt.setString(2,"李四");
//            pstmt.setString(3,"男");
//            pstmt.setInt(4,30);
//            pstmt.setString(5,"沈阳");
//            pstmt.setString(6,"150000");
            pstmt = conn.prepareStatement(sql);
            pstmt.setInt(1,student.getId());
            pstmt.setString(2,student.getName());
            pstmt.setString(3,student.getGender());
            pstmt.setInt(4,student.getScore());
            pstmt.setString(5,student.getAddress());
            pstmt.setString(6,student.getPhone());
//            int count = pstmt.executeUpdate();
//            System.out.println(count);
            System.out.println(pstmt);


        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            JDBCUtils.close(pstmt,conn);
        }


    }
    @Override
    public void remove(Integer id) {
        Connection conn = null;
        PreparedStatement pstmt = null;
        ResultSet rs = null;

        try {
            conn = JDBCUtils.getConnection();
            String sql = "delete from studentManage where id = ?";
            pstmt = conn.prepareStatement(sql);
            pstmt.setInt(1,id);
            System.out.println(pstmt);
//            int count = pstmt.executeUpdate();
//            System.out.println(count);
        } catch (SQLException e) {
            e.printStackTrace();
        }catch (ClassCastException e){
            e.printStackTrace();
        }finally {
            JDBCUtils.close(pstmt,conn,rs);
        }


    }

    @Override
    public void update(Integer id) {
        Connection conn = null;
        PreparedStatement pstmt = null;
        ResultSet rs = null;
        try{
            conn = JDBCUtils.getConnection();
            String sql = "update studentManage set score = score+10 where id = ?";
            pstmt = conn.prepareStatement(sql);
            pstmt.setInt(1,id);

            int count = pstmt.executeUpdate();
            System.out.println(count);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
