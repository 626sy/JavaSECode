package com.neusoft.homework;

/**
 * @author shihaobo
 * @date 2020/6/7 19:09
 */
public class Sun extends Star implements Universe {

    @Override
    public void doAnything() {
        System.out.println("太阳吸引着九大行星旋转");
        System.out.println("光照八分钟,到达地球");
    }
}
