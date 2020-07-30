package com.neusoft.Day14;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * @author shihaobo
 * @date 2020/7/29 9:35
 * 练习
 */
public class Demo4 {
    public static void main(String[] args) {
        HashMap<String, String> map = new HashMap<>();
        map.put("华为","荣耀10");
        map.put("苹果","plus9");
        map.put("Oppo","30");
        map.put("魅族","8");


//        map.remove("魅族");
//        map.clear();
//        map.put("Oppo","30");
        // 获取对象
        Set<Map.Entry<String, String>> entrySet = map.entrySet();
        for(Map.Entry<String, String> entry:entrySet){
            String key = entry.getKey();
            String value = entry.getValue();
            System.out.println(key+"="+value);
        }
    }
}
