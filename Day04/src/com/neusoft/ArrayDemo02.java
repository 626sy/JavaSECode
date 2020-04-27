package com.neusoft;

/**
 * @author shihaobo
 * @date 2020/4/26 14:51
 */
public class ArrayDemo02 {
    public static void main(String[] args) {
        //定义数组
        int[] arr = new int[3];
        //对数组进行赋值操作
        for (int i = 0; i < arr.length; i++) {
              arr[i]=6;
        }
        //赋值
        System.out.println(arr[0]);
        System.out.println(arr[1]);
        System.out.println(arr[2]);
        //定义数组变量arr2，将arr的地址赋值为arr2
        int[] arr2 = arr;
        //修改arr2的第二个元素为8
        arr2[1]= 8;
        System.out.println(arr[1]);
        //数组越界  两种可能：1、数组下标超出范围 2、数组中没有空间
        //System.out.println();


        //数组的空指针异常
        //意味着arr 将不会保存数组的地址了，也就是不要那些再操作数组了
/*        arr = null;         //NullPointerException

        System.out.println(arr[0]);*/

        //数组的遍历
        //遍历arr2
        for (int i = 0; i < arr2.length; i++) {
            System.out.println(arr2[i]);
        }


    }
}
