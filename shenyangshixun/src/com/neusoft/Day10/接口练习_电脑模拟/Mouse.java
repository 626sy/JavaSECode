package com.neusoft.Day10.接口练习_电脑模拟;

/**
 * @author shihaobo
 * @date 2020/7/24 16:21
 */
public class Mouse implements USB {
    @Override
    public void open() {
        System.out.println("鼠标开启，小灯一闪");
    }

    @Override
    public void close() {
        System.out.println("鼠标关闭，小灯一灭");
    }

    public void click(){
        System.out.println("点击鼠标");
    }
}
