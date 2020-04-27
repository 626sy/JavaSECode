package com.neusoft;

/**
 * @author shihaobo
 * @date 2020/4/26 19:01
 * 测试学生类
 */
public class Test01_Student {
    //类的使用
    //Java中通过创建对象去使用类
    //格式：
    //类名 对象名 = new 类名（）
    //返回值类型   具体的对象名字 = new 类();
    //我们通过对象去访问类中的成员
    //对象名.成员变量
    //对象名.成员方法()；

    public static void main(String[] args) {
        //调用 学生类
        //1、创建类：类名 对象名 = new 类名（）
        Student s = new Student();
        //2、打印这个对象
        System.out.println(s);  //返回包名+16进制地址
        //3、访问其中的成员扁蕾
        System.out.println("姓名" + s.name);
        System.out.println("年龄" + s.age);
        //4、给成员变量进行赋值
        s.name = "悟空";
        s.age = 500;
        //5、再次输出变量
        System.out.println("姓名" + s.name);
        System.out.println("年龄" + s.age);
        System.out.println("------------------------");
        //6、调用成员方法
        s.study();
        s.eat();
    }




}
