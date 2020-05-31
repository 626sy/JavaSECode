package com.neusoft;

/**
 * @author shihaobo
 * @date 2020/5/31 16:15
 */
public class Cat extends Animal {
    //无参的构造
    Cat(){
        super();
        System.out.println("Cat()");
    }

    //有参的构造
    Cat(String name){
//        super();
        this();//本类的构造方法
        //super();1.子类中每个均有super()，用来调用父类空参构造
        //2.手动调用父类的构造会覆盖默认的super()
        //3.super()，this()都必须在构造方法的第一行，所以两者不能同时出现
        this.name = name;
        System.out.println("Cat(name)");
    }
    @Override
    public void eat() {
        System.out.println("cat:eat");
    }
    public void eatTest(){
        this.eat();//this调用本类的方法
        super.eat();//调用父类的方法
    }
}