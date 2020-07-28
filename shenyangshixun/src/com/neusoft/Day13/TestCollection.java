package com.neusoft.Day13;

import java.util.ArrayList;
import java.util.Collection;

/**
 * @author shihaobo
 * @date 2020/7/28 14:49
 */
public class TestCollection {
    public static void main(String[] args) {
        // 使用多态形式创建集合对象
        Collection<String> list = new ArrayList<>();
        // add
        list.add("青松");
        list.add("貂蝉");
        list.add("吕布");
        System.out.println(list);

        // contains(E e)：判断集合中是否包含给定的元素-
        System.out.println(list.contains("吕布"));    //true
        System.out.println(list.contains("后羿"));    //false

        //remove(E e)
        System.out.println(list.remove("貂蝉"));
        System.out.println(list);

        // isEmpty()：判断当前集合是否为空
        System.out.println(list.isEmpty());
        // int size()：返回集合中元素的个数
        System.out.println(list.size());
        Object[] objects = list.toArray();
        for (int i = 0; i < objects.length; i++) {
            System.out.println(objects[i]);
        }
        // clear(）；
        list.clear();
        System.out.println(list);
    }
}
