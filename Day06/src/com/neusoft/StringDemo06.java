package com.neusoft;

public class StringDemo06 {
    public static void main(String[] args) {
        // 定义一个方法 把数组{1，2，3}按照指定的格式拼接成一个字符串
        // [word1#word2#word3]
        int list[] = {1,2,3};
        String s = formatString(list);
        System.out.println("s: " + s);
    }
    public static String formatString(int[] list){// String 为返回值类型 参数列表里面的为 int 型的数组
        // 创建一个字符串对象
        String s = new String("[");

        // 遍历
        for (int i = 0; i < list.length; i++) {
            if (i == list.length-1) {
                // 在右面拼接]
                s = s.concat(list[i] + "]");
            }else{
                s = s.concat(list[i] + "#");

            }
        }
        return s;
    }
}
