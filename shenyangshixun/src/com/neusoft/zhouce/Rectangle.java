package com.neusoft.zhouce;

/**
 * @author shihaobo
 * @date 2020/7/31 15:36
 */
public class Rectangle extends Shape {
    double width;
    double hight;


    Rectangle(char color, double width, double hight) {
        super(color);
        this.width = width;
        this.hight = hight;
    }


    @Override
    public double getArea() {
        area = width*hight;
        return area;
    }

    @Override
    public double getPre() {
        per = 2*(width+hight);
        return per;
    }

    @Override
    public void showAll() {
        System.out.println("长"+width+"宽"+hight+"周长"+getPre()+
                "面积"+getArea()+"颜色"+color);
    }
}
