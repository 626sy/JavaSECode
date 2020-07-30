package com.neusoft.zuoye.qingsong1;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/**
 * @author shihaobo
 * @date 2020/7/30 18:21
 */
public class qingsong1 {
    public static void main(String[] args) {
        HashMap<String, String> map = new HashMap<>();
        map.put("华为","nova9");
        map.put("apple","7");
        map.put("Oppo","nova6");
        map.put("小米","8");
        // 增
        map.put("华为","mate10");
        // 删除
//        String b = map.remove("华为");
//        System.out.println(b);
        String a = map.get("apple");
        System.out.println(a);
        System.out.println(map);

        // 判断是否包含指定的键
        System.out.println(map.containsKey("魅族"));
        System.out.println(map.containsKey("华为"));

        // 获取所有键，存储到set集合中
        Set<String> keys = map.keySet();
        for(String key:keys){
            String val = map.get(key);
            System.out.println(key+"-"+val);
        }
        System.out.println("==============");
        // entrySet：获取所有的键值对的set集合
        Set<Map.Entry<String, String>> entrySet = map.entrySet();
        for(Map.Entry<String ,String> entry:entrySet){
            String key1 = entry.getKey();
            String val1 = entry.getValue();
            System.out.println(key1+val1);
        }



    }
}
