package com.neusoft.Stringlei;

/**
 * @author shihaobo
 * @date 2020/7/24 8:42
 */
public class test3 {
    public static void main(String[] args) {
        // 转换功能的方法
        String s = "helloworld";
//  转化为字符数组
        char[] chars =  s.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            System.out.println(chars[i]);
        }
//  转化为字节数组
        byte[] bytes = s.getBytes();
        for (int i = 0; i <bytes.length ; i++) {
            System.out.println(bytes[i]);
        }
// 替换
        s = s.replace('h', 'H');
        System.out.println(s);
        s = s.replace("wo", "WO");
        System.out.println(s);
    }
}
