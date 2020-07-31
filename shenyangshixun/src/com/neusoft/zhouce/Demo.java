package com.neusoft.zhouce;

import org.w3c.dom.ls.LSOutput;

/**
 * @author shihaobo
 * @date 2020/7/31 14:37
 */
public class Demo {
    public static void main(String[] args) {
        try{
            badMethod();
            System.out.println("A");
        }catch(Exception ex){
            System.out.println("B");
        }finally{
            System.out.println("C");
        }
        System.out.println("D");
    }
public static void badMethod(){

}

}
