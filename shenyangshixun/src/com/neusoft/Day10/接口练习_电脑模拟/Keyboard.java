package com.neusoft.Day10.接口练习_电脑模拟;

/**
 * @author shihaobo
 * @date 2020/7/24 16:21
 */
public class Keyboard implements USB
{
    public void open() {
        System.out.println("键盘开启，小彩灯爆闪");
    }

    @Override
    public void close() {
        System.out.println("键盘关闭，小彩灯灭");
    }

    public void type(){
        System.out.println("键盘打字");
    }
}
