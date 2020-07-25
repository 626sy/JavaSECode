package com.neusoft.DayJU25;

/**
 * @author shihaobo
 * @date 2020/7/25 9:05
 */
public class FinalDemo1 {
    public static void main(String[] args) {
        //声明一个变量，被final修饰
        final int a;
        a = 10;
        // a = 20;  不可以

        final int b = 20;
        // b = 20;  不可以

        //能运行
        for (int i = 0; i < 10; i++) {
            final int c = i;
            System.out.println(c);
        }
        //报错
//        final int c = i;
//        for (int i = 0; i < 10; i++) {
//             c = i;
//            System.out.println(c);
//        }


    }
}
