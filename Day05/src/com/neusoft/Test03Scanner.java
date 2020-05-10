package com.neusoft;

import java.util.Scanner;

/**
 * @author shihaobo
 * @date 2020/5/10 16:44
 */
public class Test03Scanner {
    public static void main(String[] args) {
        //匿名对象作为返回值
        getScanner();

    }

    public static Scanner getScanner(){
        //普通方式：Scanner的返回值
//        Scanner scanner = new Scanner(System.in);
//        return scanner;

        //匿名对象作为方法的返回值
        return new Scanner(System.in);
    }
}
