package com.neusoft.Day15.lambdaDemo;

/**
 * @author shihaobo
 * @date 2020/7/30 19:43
 */
public class Demo7 {
    public static void main(String[] args) {
        // 使用lambda表达式 调用测试
        invokeShow(100, a -> a + 100);
    }
    public static void invokeShow(int a, Show show){
        int res = show.showNum(a);
        System.out.println(res);

    }
}
