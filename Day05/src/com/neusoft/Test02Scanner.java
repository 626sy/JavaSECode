package com.neusoft;

import java.util.Scanner;

/**
 * @author shihaobo
 * @date 2020/5/10 16:44
 */
public class Test02Scanner {
    public static void main(String[] args) {
        //匿名对象可以作为方法的参数和返回值
        //1.作为参数
//        Scanner sc = new Scanner(System.in);
//        //匿名对象作为方法的接收参数
//        input(sc);

        input(new Scanner(System.in));
    }
    public static void input(Scanner scanner){
        System.out.println(scanner);
    }
}
