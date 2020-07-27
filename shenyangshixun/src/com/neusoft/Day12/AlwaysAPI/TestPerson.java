package com.neusoft.Day12.AlwaysAPI;

/**
 * @author shihaobo
 * @date 2020/7/27 14:16
 */
public class TestPerson {
    public static void main(String[] args) {
        Person p1 = new Person("李四",15);
        Person p2 = new Person("张三",15);
        Person p3 = new Person("李四",15);
//        com.neusoft.Day12.AlwaysAPI.Person@282ba1e
        System.out.println(p1);
        System.out.println(p1.equals(p2));
        System.out.println(p1.equals(p3));

    }
}
