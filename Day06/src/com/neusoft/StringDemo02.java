package com.neusoft;

public class StringDemo02 {
    public static void main(String[] args) {
         /*
        2.length()
        返回此字符串的长度。
        实际调用的是底层length数组的属性
        阅读原码，1.原码的书写都是很严谨的
                2.好公司经常会问
        */
        String s = "helloword";
        System.out.println(s.length());
        System.out.println("-------------------------------------");
        /* 3.concat(String str)
        将指定字符串连接到此字符串的结尾。与字符串的拼接很像*/
        String s1 = s.concat("----hhhh");
        System.out.println(s1);
        // 4. charAt(int index)返回指定索引处 char值
        char c = s.charAt(0);
        char c2 = s.charAt(1);
        System.out.println(c);
        System.out.println(c2);
        // 5.indexOf(String str)
        //          返回指定子字符串在此字符串中第一次出现处的索引。
        System.out.println(s.indexOf('l'));
        System.out.println(s.indexOf('o'));
        System.out.println(s.indexOf('z'));// 没有返回-1
        // 6.substring(int beginIndex, int endIndex)

        // [beginIndex,endIndex)包含beginIndex 不包含endIndex
        //          返回一个新字符串，它是此字符串的一个子字符串。
        System.out.println(s.substring(0));
        System.out.println("------------------------------");
        String s2 = s.substring(0);
        System.out.println(s2 == s);
        System.out.println(s2.equals(s));
        String substring = s.substring(0, 4);
        System.out.println(substring);
        System.out.println(s.substring(0,s.length()));

        /*
        * 转化功能的方法
        *toCharArray()
          将此字符串转换为一个新的字符数组。
        *getBytes(String charsetName)
          使用指定的字符集将此 String 编码为 byte 序列，并将结果存储到一个新的 byte 数组中。
          * replace(CharSequence target, CharSequence replacement)
          使用指定的字面值替换序列替换此字符串所有匹配字面值目标序列的子字符串。
        * */

    }
}
