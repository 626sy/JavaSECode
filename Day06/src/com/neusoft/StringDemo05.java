package com.neusoft;

public class StringDemo05 {
    public static void main(String[] args) {
        // 9.split(String regex, int limit)
        //          根据匹配给定的正则表达式来拆分此字符串。
        // 对字符串进行分割
        String s = "aa|bb|cc";
        String s1 = "aa ,bb,cc";

        String[] strArray = s.split("|");
        String[] strArray1 = s1.split(",");
        for (int i = 0; i < strArray1.length; i++) {
            System.out.println(strArray1[i]);
        }
    }
}
