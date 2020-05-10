package com.neusoft;

/**
 * @author shihaobo
 * @date 2020/5/10 14:39
 */
public class TestJavaBean {
    // JavaBean     是一种Java的标准的规范
    //符合JavaBean的类要求1、类必须是具体的和公共的2、并且具有无参的构造方法
    //3、提供用来操作成员变量的set和get方法， 和数据库中表字段对应的实体类就是一个典型JavaBean

    //格式
    // 成员变量
    // 无参构造方法【必须的】
    // 有参构造方法【建议】
    // 成员方法
    // getxxx()
    // setxxx()
    public static void main(String[] args) {
        //无参的构造方法的调用
        StudentJavabean s = new StudentJavabean();
        s.setAge(10);
        s.setName("shihaobo");
        System.out.println(s.getName()+"---"+s.getAge());

        //有参的构造方法的调用
        StudentJavabean s2 = new StudentJavabean("关云长",30);
        System.out.println(s2.getName()+"---"+s2.getAge());



    }

}
