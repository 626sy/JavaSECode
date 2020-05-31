package com.neusoft;

public class TestMathDemo02 {
    public static void main(String[] args) {
        // 计算 -10.8 到 5.9 绝对值大于等于6 或者小于2.1 的整数
        int count = 0;
        for (double i = -10.9; i <= 5.9 && i >= -10.9; i++) {
            if (Math.abs(i) >=6 ||Math.abs(i)< 2.1) {
                count++;

                System.out.print(Math.ceil(i) + " ");

            }
        }
        System.out.println("有"+count+"个");
    }
}
