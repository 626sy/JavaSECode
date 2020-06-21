package com.neusoft.homwwork1;

/**
 * @author shihaobo
 * @date 2020/6/14 20:24
 */
public class Test {
    public static void main(String[] args) {
        Student student1 = new Student();
        Student student2 = new Student();
        Student student3 = new Student();
        student1.setName("小红");
        student2.setName("小亮");
        student3.setName("小明");
        student1.setChuqin(true);
        student2.setChuqin(true);
        student3.setChuqin(false);

        Teacher teacher = new Teacher();
        teacher.setName("张老师");

        Course course = new Course();
        course.setName("Java");

        course.show(teacher);
        teacher.chuqin(student1);
        teacher.chuqin(student2);
        teacher.chuqin(student3);

    }
}
