package com.neusoft.Day10.Homework.one;

public interface A {
    public abstract void showA();

    public default void showB(){
        System.out.println("BBBB");
    }
}
