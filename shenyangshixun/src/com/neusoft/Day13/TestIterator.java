package com.neusoft.Day13;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/**
 * @author shihaobo
 * @date 2020/7/28 15:10
 */
public class TestIterator {
    public static void main(String[] args) {
        // 使用多态形态创建集合对象
        Collection<String> coll = new ArrayList<>();

        coll.add("青松");
        coll.add("貂蝉");
        coll.add("吕布");
        // 遍历
        Iterator<String> iterator = coll.iterator();
        // iterator.hasNext() 判断是否有迭代元素
        while (iterator.hasNext()){
            //
            String s = iterator.next();
            System.out.println(s);
        }
    }
}
