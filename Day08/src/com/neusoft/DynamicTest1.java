package com.neusoft;

import java.util.ArrayList;

/**
 * @author shihaobo
 * @date 2020/6/7 16:54
 */
public class DynamicTest1 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(122);
        list.add(322);
        list.add(23222);
        list.add(3545);

        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }

        int a = 100;
        // 变成double 100.00
//        格式：子类类型 对象名 = (子类类型)new 父类对象

    }
}
