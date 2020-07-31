package com.neusoft.Day16.singletonerhandemo;

/**
 * @author shihaobo
 * @date 2020/7/31 8:57
 */
public class Singleton {
    private Singleton(){};

    private static Singleton instance = new Singleton();

    public static Singleton getInstance(){
        return instance;
    }

}
