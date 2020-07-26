package com.neusoft.WeekTest;

/**
 * @author shihaobo
 * @date 2020/7/26 10:33
 * 1. 一个数如果恰好等于它的因子之和，这个数就称为 "完数 "。例如6=1＋2＋3
 * 编程找出1000以内的所有完数。
 */
public class wanshu {
    public static void main(String[] args) {
        int sum = 0;
        for (int i = 1; i <= 1000; i++) {
            int a = 0;
            for (int j = 1; j < i; j++) {
                if (i % j == 0)
                    a += j;
            }
            if (a == i) {
                System.out.println(a);
                sum++;

            }
        }
    }
}
