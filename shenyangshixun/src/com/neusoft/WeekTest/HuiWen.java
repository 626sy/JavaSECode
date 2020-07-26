package com.neusoft.WeekTest;

/**
 * @author shihaobo
 * @date 2020/7/26 10:46
 * 9.  一个5位数，判断它是不是回文数。即12321是回文数，个位与万位相同，十位与千位相同。
 */
public class HuiWen {
    public static void main(String[] args) {
        for (int i = 10000; i <= 99999; i++)
        {
            int gw = i % 10; //个位
            int ww = i / 10000; //万位

            int sw = (i / 10) % 10; //十位
            int qw = (i / 1000) % 10; //千位

            if ((gw == ww) && (sw == qw))
            {
                System.out.println(i+"是回文");
            }
        }
    }
}
