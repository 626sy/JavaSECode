package com.neusoft.zhouce;

import javafx.scene.shape.Circle;

import java.util.ArrayList;

/**
 * @author shihaobo
 * @date 2020/7/31 15:52
 */
public class Test {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[2];
        shapes[0] = new Rectangle('蓝', 1, 2);
//        shapes[1] = new Circle('红',1);
        for(Shape s:shapes){
            s.showAll();
        }
    }
}
