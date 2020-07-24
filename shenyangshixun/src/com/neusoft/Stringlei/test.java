package com.neusoft.Stringlei;

/**
 * @author shihaobo
 * @date 2020/7/24 8:10
 */
public class test {
    public static void main(String[] args) {
        String s1 = "hello";
        String s2 = "hello";
        String s3 = "HELLO";
        // 将此String 与另一个String 比较
        System.out.println(s1.equals(s2)); // true
        System.out.println(s1.equals(s3)); //false
        // 将此Sting与另一个String比较，不考虑大小写
        System.out.println(s1.equalsIgnoreCase(s2)); //true
        System.out.println(s1.equalsIgnoreCase(s3)); //true
    }
}
