package com.neusoft.JDBC.studentAdmin;

import com.neusoft.JDBC.studentAdmin.dao.Impl.StudentDaoImpl;
import com.neusoft.JDBC.studentAdmin.domain.Student;

import java.util.List;

/**
 * @author shihaobo
 * @date 2020/8/6 15:48
 */
public class MainStudent {
    public static void main(String[] args) {
        System.out.println("欢迎登录Low版学生管理系统");

        StudentDaoImpl studentDao = new StudentDaoImpl();
        System.out.println("---------学生列表---------");
//        List<Student> list = studentDao.findAll();
//        for(Student s:list){
//            System.out.println(s);
//        }
        System.out.println("------保存学生------");
        // new Student
        Student student = new Student(2,"李四","男",30,"沈阳","150000");
        studentDao.save(student);

        // 修改

        studentDao.update(2);
        // 删除

//        studentDao.remove(1);

    }
}
