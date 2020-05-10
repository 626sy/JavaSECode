package com.neusoft;

/**
 * @author shihaobo
 * @date 2020/5/10 20:55
 * 自己定义一个ArrayList
 */
public class OwnArrayList01 {
    //定义成员变量
    //datas 数组 存储数据
    private int[] data;
    //size 集合中有效元素的个数
    private int size;
    //构造函数
    public OwnArrayList01(int capacity){
        data = new int[capacity];
        size = 0;
    }
    //定义无参构造方法，默认容量是10
    public OwnArrayList01(){
        this(10);
    }
//    public OwnArrayList01(){
//        data = new int[10];
//        size = 0;
//    }

    //成员方法
    //保留数组中元素的个数
    public int getSize(){
        return size;
    }
    //保留数组的容量
    public int getCapacity(){
        return data.length;
    }
    // 获取数组是否为空
    public boolean isEmpty(){
        return size == 0;
    }
}
