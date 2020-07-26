package com.neusoft.WeekTest;

/**
 * @author shihaobo
 * @date 2020/7/26 10:45
 *
7. 有一分数序列：2/1，3/2，5/3，8/5，13/8，21/13...求出这个数列的前20项之和。
分析：抓住分子与分母的变化规律。
 */
public class FenSu {
    public static void main(String[] args) {
        double fz = 2.0;
        double fm = 1.0;
        double sum = 0.0;

        for(int i=1; i<=20; i++)
        {
            System.out.println(fz+"/"+fm);
            sum = sum+(fz/fm);
            double t = fz;
            fz = fz+fm;
            fm = t;
        }

        System.out.println(sum);
    }
}
