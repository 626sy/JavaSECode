package com.neusoft.homework;

/**
 * @author shihaobo
 * @date 2020/6/7 19:10
 */
public class UniverseTest {
    public static void main(String[] args) {
        Star star = new Star();
        star.shine();
        System.out.println("============");

        Universe sun = new Sun();
        sun.doAnything();

        Sun star1 = (Sun)sun;
        star1.shine();

        }

    }

