package com.neusoft.HomeWork;

/**
 * @author liuboting
 * @date 2020/6/14 20:18
 */

public class Teacher {
    String name;
    public Student student;

    public Teacher(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setStudent(Student student) {
        this.student = student;
        student.setAttendance(false);
    }
}