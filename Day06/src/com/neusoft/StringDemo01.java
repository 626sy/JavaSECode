package com.neusoft;





import java.util.Scanner;

public class StringDemo01 {
    public static void main(String[] args) {
        // String 的equal方法
        // 创建字符串
        String s1 = "hello";
        String s2 = "hello";
        String s3 = "HELLO";
        // equals(Object anObject)
        //          将此字符串与指定的对象比较
        // 相同的话为true 不同为false
        System.out.println(s1.equals(s2));
        System.out.println(s2.equals(s1));
        boolean b = s1.equals(s3);
        System.out.println(b);

        System.out.println(s1.equals(s3));
        System.out.println(s1.equalsIgnoreCase(s2)); //igorecase忽略大小写
        System.out.println(s1.equalsIgnoreCase(s3));

        // 扩展：大厂面试题 （重点中的重点）

        // 基本数据类型比较用 ==

        // 引用数据类型比较的是 地址值

        // String的equals是如何实现的
//        public boolean equals(Object anObject) {
//            if (this == anObject) {
//                return true;
//            } // 跟自己进行一次比较
//            if (anObject instanceof String) {  // 传入的 anObject是否属于String类型
//                String anotherString = (String)anObject;  // anObject强制转换String类型
//                int n = value.length; // s1长度
//                if (n == anotherString.value.length) {
//                    char v1[] = value;   // 赋值
//                    char v2[] = anotherString.value; // 赋值
//                    int i = 0;
//                    while (n-- != 0) {   // v1 和v2中每一个元素逐一比较
//                        if (v1[i] != v2[i])
//                            return false;
//                        i++;
//                    }
//                    return true;
//                }
//            }
//            return false;
//        }



    }

    // 基本类型数据 == 比较真实值
    // 引用数据 == 比较地址值

}
