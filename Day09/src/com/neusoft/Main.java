package com.neusoft;


import java.util.ArrayList;
//内部类

//格式
//
//class aA{
//    class B{
//
//    }
//}

//访问特点：
/*
* 内部类可以直接访问外部成员，包括私有成员
* 外部类要访问内部类成员，必须要建立内部类的对象
* 格式：外部类名.内部类名 对象名 = new 外部类型().new 内部类型();
* */

public class Main{
    public static void main(String[] args) {
        Person person1 = new Person("皮皮虾", 14);
        Person person2 = new Person("皮皮虾", 14);
        System.out.println(person1.equals(person2));
    }



}