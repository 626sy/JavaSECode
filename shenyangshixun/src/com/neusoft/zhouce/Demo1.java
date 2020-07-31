package com.neusoft.zhouce;

/**
 * @author shihaobo
 * @date 2020/7/31 16:20
 */
public class Demo1 {
    public static void main(String[] args) {
        double sum = 2;
        double m = 2;
        double n = 1;
        for (int i = 2; i < 20; i++) {
            m = m+n;
            n = m -n;
            sum = (double)m/n;
        }
        System.out.println(sum);
    }
}
