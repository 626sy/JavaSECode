package com.neusoft.Day13;

/**
 * @author shihaobo
 * @date 2020/7/28 11:26
 */
public class TestStringBuilder2 {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("HELLO").append("world").append("java");
        String str = sb.toString();
        System.out.println(str);

    }
}
