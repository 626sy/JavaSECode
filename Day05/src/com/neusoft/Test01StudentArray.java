package com.neusoft;

/**
 * @author shihaobo
 * @date 2020/5/10 18:33
 */
public class Test01StudentArray {
    //创建一个学生数字，存储刘、关、张、赵这四名同学的信息

    public static void main(String[] args) {
        //创建一个StudentJavaBean类的数组对象，名字叫students
//        String [] students = new String[]{"刘备","关羽","张飞","赵云"};
        StudentJavabean[] students = new StudentJavabean[4];


        //创建四个类实例，分别初始化四个人的信息
        StudentJavabean s1 = new StudentJavabean("刘备", 50);
        StudentJavabean s2 = new StudentJavabean("关羽", 45);
        StudentJavabean s3 = new StudentJavabean("张飞", 54);
        StudentJavabean s4 = new StudentJavabean("赵云", 35);
        // 把这四个实例 赋值给 students
        students[0] = s1;
        students[1] = s2;
        students[2] = s3;
        students[3] = s4;
        // 遍历输出这四个同学的名字个年龄
        for (int i = 0; i < students.length; i++) {
            StudentJavabean s = students[i];
            System.out.println(s.getName()+"---"+s.getAge());
        }

        // 上面我们使用的是数组对象，好处是一个容器，可以存储多个对象，这样的话一个变量就可以存放很多信息
        // 但是数组对象在创建的时候容量是固定的，无法根据需求动态扩容
        // java 提供了一个ArrayList类， 是大小可变的数组，
        // 存储在数组中的数据我们一般叫元素，可以不断添加元素,大小也会不断增长

    }

}
