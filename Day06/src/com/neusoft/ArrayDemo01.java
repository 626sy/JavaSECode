package com.neusoft;



import java.util.Arrays;

public class ArrayDemo01 {
    public static void main(String[] args) {
        //返回指定数组内容的字符串表示形式
        //返回对象字符串表现形式
        int[] arr = {1,2,4,3,7,21};
        System.out.println(arr);
        System.out.println(Arrays.toString(arr));
        //static void sort(int[] a) 静态的 无返回值的
        //          对指定的 int 型数组按数字升序进行排序
        System.out.println("排序前" + Arrays.toString(arr));
        Arrays.sort(arr);  // 原地升序排序操作
        System.out.println("排序前" + Arrays.toString(arr));
        System.out.println("--------------------------------");
        String line = "DSAmsadsaopMIPLOK";// 字符升序排序，并且倒序打印

        char[] chars1 = line.toCharArray();
        //toCharArray()
        //          将此字符串转换为一个新的字符数组。

        Arrays.sort(chars1);
        System.out.println("shengxu: " + Arrays.toString(chars1));
        for (int i = 0; i < chars1.length; i++) {

            System.out.print(chars1[chars1.length-i-1] + " ");
        }

        //copyOf(boolean[] original, int newLength)
        //          复制指定的数组，截取或用 false 填充（如有必要），以使副本具有指定的长度。

        char[] copy = Arrays.copyOf(chars1, 4);
        System.out.println(Arrays.toString(copy));


    }
}
