package com.neusoft;

/**
 * @author shihaobo
 * @date 2020/4/26 16:54
 */
public class ArrayDemo07 {
    public static void main(String[] args) {
        int a = 1;
        int b = 2;
        System.out.println(a);
        System.out.println(b);
        change(a, b);
        System.out.println(a);
        System.out.println(b);
        int[] arr = {1, 3, 5};
        System.out.println(arr[0]);
        change2(arr);
        System.out.println(arr[0]);
    }
    public static void change(int a ,int b){
        a = a + b;
        b = b + a;
//        System.out.println(a);
//        System.out.println(b);

    }
    public static void change2(int arr[]){
        arr[0] = 200;
    }
}
