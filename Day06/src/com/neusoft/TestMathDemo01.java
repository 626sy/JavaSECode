package com.neusoft;

public class TestMathDemo01 {
    public static void main(String[] args) {
        // abs(double a)
        //          返回 double 值的绝对值。
        int i = Math.abs(-6);
        System.out.println(i);

        double j = Math.abs(-6.3);
        System.out.println(j);

        //ceil(double a)
        //          返回最小的（最接近负无穷大）double 值，该值大于等于参数，并等于某个整数。
        // 返回大于等于参数的最小整数
        double ceil1 = Math.ceil(3.3);
        double ceil2 = Math.ceil(-3.3);
        double ceil3 = Math.ceil(5.1);
        System.out.println(ceil1 + " " + ceil2 +" "+ ceil3);

        //round(double a)
        //          返回最接近参数的 long。
        // 四舍五入
        System.out.println(Math.round(5.5)); // 6
        System.out.println(Math.round(5.4)); // 5


    }
}
