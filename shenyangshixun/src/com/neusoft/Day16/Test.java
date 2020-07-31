package com.neusoft.Day16;

import com.neusoft.Day16.singletonerhandemo.Singleton;

/**
 * @author shihaobo
 * @date 2020/7/31 8:41
 */
public class Test {
    public static void main(String[] args) {
//        new Singleton()       不能new
        Singleton instance = Singleton.getInstance();

    }
}
