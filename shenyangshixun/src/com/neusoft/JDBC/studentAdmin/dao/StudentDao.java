package com.neusoft.JDBC.studentAdmin.dao;


import com.neusoft.JDBC.studentAdmin.domain.Student;

import java.util.List;

/**
 * @author shihaobo
 * @date 2020/8/6 15:50
 */
public interface StudentDao {
    // 学生列表 查询所有学生
    public List<Student> findAll();
    // 保存某个学生
    public  void save(Student student);
    // 删除某个学生
    public void remove(Integer id);
    // 修改某个学生
    public void update(Integer id);
}
