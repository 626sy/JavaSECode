package com.neusoft.Day14;

import java.util.HashMap;

/**
 * @author shihaobo
 * @date 2020/7/30 8:24
 */
public class TestStudent {
    public static void main(String[] args) {
        // 创建map
        HashMap<Student, String > map = new HashMap<>();

        // 添加元素
        map.put(new Student("刘能",34),"锦州");
        map.put(new Student("赵四", 23), "葫芦岛");
        map.put(new Student("宋小宝", 45), "大连");
        map.put(new Student("王天来", 25), "营口");
        map.put(new Student("王天来", 25), "营口");
        // 遍历
        for(Student key:map.keySet()){
            String val = map.get(key);
            System.out.println(key + "....."+val);
        }
    }
}
