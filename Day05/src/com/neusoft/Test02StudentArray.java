package com.neusoft;

import java.util.ArrayList;

/**
 * @author shihaobo
 * @date 2020/5/10 18:33
 */
public class Test02StudentArray {
    public static void main(String[] args) {
        new ArrayList<Student>(); //<E>表示一种指定的数据类型，叫做泛型
        new ArrayList<String>(); //<E>表示一种指定的数据类型，叫做泛型
        new ArrayList<Integer>(); //<E>表示一种指定的数据类型，叫做泛型

        //使用ArrayList
        ArrayList<StudentJavabean> list = new ArrayList<>();

        //指定元素添加到集合的尾部
//        list.add("张三");
        //创建刘关张赵四人的信息
        StudentJavabean s1 = new StudentJavabean("刘备", 50);
        StudentJavabean s2 = new StudentJavabean("关羽", 45);
        StudentJavabean s3 = new StudentJavabean("张飞", 54);
        StudentJavabean s4 = new StudentJavabean("赵云", 35);

        //进行添加操作
        list.add(s1);
        list.add(s2);
        list.add(s3);
        list.add(s4);

        //打印list
        System.out.println(list);

        System.out.println(list.size());
        //遍历ArrayList的第一种方式fori循环
        for (int i = 0; i < list.size(); i++) {
            StudentJavabean s = list.get(i);
            System.out.println(s.getName()+"---"+s.getAge());
        }

    }
}
