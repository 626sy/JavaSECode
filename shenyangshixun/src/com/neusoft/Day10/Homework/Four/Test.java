package com.neusoft.Day10.Homework.Four;

/**
 * @author shihaobo
 * @date 2020/7/24 22:52
 */
public class Test {
    public static void main(String[] args) {
        star star = new star();
        star.shine();
        System.out.println("==================");

        Universe universe = new Sun();
        universe.doAnything();
        Sun sun = (Sun) universe;
        sun.shine();
    }
}
