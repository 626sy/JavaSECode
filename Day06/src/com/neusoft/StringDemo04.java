package com.neusoft;

public class StringDemo04 {
    public static void main(String[] args) {
        //转化功能的方法
        //6.toCharArray()
        //  将此字符串转换为一个新的字符数组。
        String s = "abcd";
        char[] chars = s.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            System.out.println(chars[i]);
        }

        //7.getBytes(String charsetName)
        //  使用指定的字符集将此 String 编码为 byte 序列，并将结果存储到一个新的 byte 数组中。
        byte[] bytes = s.getBytes();
        for (int i = 0; i < bytes.length; i++) {
            System.out.println(bytes[i]);
        }

        //8.replace(CharSequence target, CharSequence replacement)
        //  使用指定的字面值替换序列替换此字符串所有匹配字面值目标序列的子字符串。
        String str = "IT王者 IT青铜";
        String replace = str.replace("IT", "it");
        str = replace;
        System.out.println(str);
        System.out.println(replace);
    }

}
