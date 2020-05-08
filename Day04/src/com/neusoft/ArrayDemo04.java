package com.neusoft;

/**
 * @author shihaobo
 * @date 2020/4/26 15:27
 * 对数组进行反转
 * 1、只要实现就行
 * 2、不创建新的数组
 */
public class ArrayDemo04 {
    public static void main(String[] args) {
        int[] arr2 = new int[5];
        int[] arr = new int[]{1, 2, 3, 4, 5, 6};
        /*
        * for(初始化条件1，初始化条件2； 循环条件；步进运算1，步进运算2)
        * 定义min = 0 最小索引值，max = arr.length-1 最大索引值
        * */
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "\t");
        }
        System.out.println("数组的长度为"+ arr.length);


        for (int first=0, last = arr.length-1;first < last;first++,last--){
            int temp = arr[first];
            arr[first] = arr[last];
            arr[last] = temp;
        }

/*        for (int i = 0; i < arr.length/2; i++) {
            int temp = arr[i];
            arr[i] = arr[arr.length-i-1];
            arr[arr.length-i-1] = temp;
        }*/
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "\t");
        }

    }

}
