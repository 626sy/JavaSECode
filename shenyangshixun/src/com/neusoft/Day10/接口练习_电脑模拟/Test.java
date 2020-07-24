package com.neusoft.Day10.接口练习_电脑模拟;

/**
 * @author shihaobo
 * @date 2020/7/24 16:40
 */
public class Test {
    public static void main(String[] args) {
        Computer c = new Computer();
        c.run();
        // 父类引用指向子类对象：多态
//        Mouse m = new Mouse();
//        // 电脑使用鼠标
//        c.useUSB(m);
        USB u = new Mouse();
        // 电脑使用鼠标
        c.useUSB(u);
        Keyboard kb = new Keyboard();
        c.useUSB(kb);

        c.shutDown();
    }
}
