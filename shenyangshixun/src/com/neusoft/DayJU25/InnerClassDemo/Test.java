package com.neusoft.DayJU25.InnerClassDemo;

/**
 * @author shihaobo
 * @date 2020/7/25 10:28
 */
public class Test {
    public static void main(String[] args) {
        //外部类名 内部类名 对象名 = new 外部类型（）.new 内部类型（）
        Person p = new Person();
        Person.Heart heart = p.new Heart();
        heart.jump();
        p.setLive(false);
        heart.jump();
    }
}
