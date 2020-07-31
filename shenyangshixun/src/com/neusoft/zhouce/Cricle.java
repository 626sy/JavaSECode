package com.neusoft.zhouce;

/**
 * @author shihaobo
 * @date 2020/7/31 15:47
 */
public class Cricle extends Shape {
    final double pi = 3.14;
    double ridius;

    Cricle(){}

    public Cricle(char color, double ridius) {
        super(color);
        this.ridius = ridius;
    }

    @Override
    public double getArea() {
        area = pi*ridius*ridius;
        return area;
    }

    @Override
    public double getPre() {
        per = 2*pi*ridius;
        return per;
    }

    @Override
    public void showAll() {
        System.out.println("半径："+ridius);
        System.out.println("面积："+getArea());
        System.out.println("周长："+getPre());
        System.out.println("颜色："+color);
    }
}

