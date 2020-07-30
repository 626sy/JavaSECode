package com.neusoft.Day15.lambdaDemo;

/**
 * @author shihaobo
 * @date 2020/7/30 19:43
 */
public class Demo6 {
    public static void main(String[] args) {
        // 使用lambda表达式 调用测试
        invokeCalc(5,6, (a, b)-> a + b);
    }
    public static void invokeCalc(int a, int b, Caculator caculator){
        int res = caculator.calc(a, b);
        System.out.println("res = "+ res);
    }
}
