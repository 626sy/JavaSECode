package com.neusoft;

/**
 * @author shihaobo
 * @date 2020/6/7 18:53
 */
public class LapTopTest {
    public static void main(String[] args) {
        Laptop laptop = new Laptop();
        // 开启
        laptop.run();
        // 使用鼠标(多态方式)
        USB mouse = new Mouse();
        laptop.useUSB(mouse);

        // 使用键盘
        USB keyBoard = new KeyBoard();
        laptop.useUSB(keyBoard);

        // 笔记本关闭
        laptop.shutDown();

    }
}
