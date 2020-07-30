package com.neusoft.Day15.lambdaDemo;

/**
 * @author shihaobo
 * @date 2020/7/30 16:48
 */
public class Demo5 {
    public static void main(String[] args) {
        // 使用lambda表达式调用测试
        invokeCalc(5,6,(int a,int b)->{
            return a + b;
        });
    }
    public static void invokeCalc(int a, int b,Caculator caculator  ){
        int res = caculator.calc(a,b);
        System.out.println("res = "+ res);
    }

}
