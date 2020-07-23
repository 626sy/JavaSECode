package com.neusoft.test2;

/**
 * @author shihaobo
 * @date 2020/7/23 14:40
 */
public abstract class Poultry {
    private String name;
    private String symptom;
    private String illness;
    private int age;

    //抽象成员方法：showSymptom
    public abstract void showSymptom();

    //普通成员方法：showMsg
    public void showMsg() {
        System.out.println("动物种类" + name);
        System.out.println("年龄 " + age + " 岁");
        System.out.println("入院原因:" + illness);
    }

    // 提供空参和带参构造方法
    public Poultry() {
        super();
    }

    public Poultry(String name, String symptom, String illness, int age) {
        this.name = name;
        this.symptom = symptom;
        this.illness = illness;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSymptom() {
        return symptom;
    }

    public void setSymptom(String symptom) {
        this.symptom = symptom;
    }

    public String getIllness() {
        return illness;
    }

    public void setIllness(String illness) {
        this.illness = illness;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}

