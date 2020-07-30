package com.neusoft.Day15.lambdaDemo;

import java.util.Arrays;
import java.util.Comparator;

/**
 * @author shihaobo
 * @date 2020/7/30 16:33
 */
public class Demo4 {
    public static void main(String[] args) {
        Person[] array = {
                new Person("貂蝉",223),
                new Person("孙尚香",18),
                new Person("妲己",100),
                new Person("杨玉环",210),
        };

        Arrays.sort(array, (Person a,Person b)->{
            return a.getAge()-b.getAge();
        });

        for(Person person:array){
            System.out.println(person);
        }

    }
}
