package com.neusoft.zhouce;

/**
 * @author shihaobo
 * @date 2020/7/31 15:13
 */
public abstract class Shape {
    double area;
    double per;
    char color;

    Shape() {
    }

    Shape(char color) {
        this.color = color;
    }

    public abstract double getArea();
    public abstract double getPre();
    public abstract void showAll();
}
