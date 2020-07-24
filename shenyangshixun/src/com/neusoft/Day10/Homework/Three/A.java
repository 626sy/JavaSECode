package com.neusoft.Day10.Homework.Three;

public interface A {
    public abstract void showA();

    public static void showB10(){
        System.out.println("static BBBB");

        show10("BBBB");
    }
    public static void showC10(){
        System.out.println("static CCCC");

        show10("CCCC");
    }

    private static void show10(String str){
        for (int i = 0; i < 10; i++) {
            System.out.print(str+"  ");
        }
        System.out.println();
    }
}
