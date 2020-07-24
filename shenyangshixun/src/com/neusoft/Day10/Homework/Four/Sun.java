package com.neusoft.Day10.Homework.Four;

/**
 * @author shihaobo
 * @date 2020/7/24 22:46
 */
public class Sun extends star implements Universe {
    @Override
    public void doAnything() {
        System.out.println("sun：太阳吸引着九大行星旋转");
    }

    @Override
    public void shine() {
        System.out.println("sun:光照八分钟，到达地球");
    }
}
