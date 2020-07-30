package com.neusoft.zuoye.qingsong1;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * @author shihaobo
 * @date 2020/7/30 18:58
 */
public class Test {
    public static void main(String[] args) {
        Phone phone1 = new Phone("华为","p10");
        Phone phone2 = new Phone("apple","8");
        Phone phone3 = new Phone("魅族","pro");
        Phone phone4 = new Phone("Oppo","R9");

        HashMap map = new HashMap<>();
        map.put(phone1,2888);
        map.put(phone2,4000);
        map.put(phone3,5333);
        map.put(phone4,4788);
        System.out.println(map);
        Set<Phone> set = map.keySet();
        Collection<Integer> values = map.values();
        Set<Map.Entry<Phone,Integer>> entrySet = map.entrySet();
        for(Map.Entry<Phone,Integer>entry:entrySet){
            Phone key = entry.getKey();
            Integer value = entry.getValue();
            System.out.println(key+"="+value);
        }


    }
}
