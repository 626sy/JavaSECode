package com.neusoft.Day15.lambdaDemo;

/**
 * @author shihaobo
 * @date 2020/7/30 19:47
 */
public class CookImpl implements Cook{
    @Override
    public void makeFood() {
        System.out.println("CookImpl做的饭");
    }
}
