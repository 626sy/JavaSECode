package com.neusoft.test2;

/**
 * @author shihaobo
 * @date 2020/7/23 14:47
 */
public class Duck extends Poultry {
    //空参构造方法
    public  Duck(){

    }
    //有参构造方法


    public Duck(String name, String symptom, String illness, int age) {
        super(name, symptom, illness, age);
    }

    @Override
    public void showSymptom() {
        System.out.println("症状为"+getSymptom());
    }
}
