package com.neusoft.Stringlei;

import java.util.Arrays;

/**
 * @author shihaobo
 * @date 2020/7/24 8:45
 */
public class test4 {
    public static void main(String[] args) {
        // 分割功能
        //String s = "1131225468@qq.com";
        String s = "aa/bb/cc";
// String[] strings = s.split("@");
        String[] strings = s.split("/");
        System.out.println(Arrays.toString(strings));
    }
}
