package com.neusoft.test2;

/**
 * @author shihaobo
 * @date 2020/7/23 18:51
 */
public class test2 {
    public static void main(String[] args) {
        Duck duck = new Duck("鸭子","感冒","发烧",2);
        duck.showMsg();
        duck.showSymptom();
    }
}
