package com.neusoft;

/**
 * @author shihaobo
 * @date 2020/5/10 14:48
 */
public class StudentJavabean {

    // 成员变量
    private String name;
    private int age;
    // 无参构造方法【必须的】
    public  StudentJavabean(){

    }
    // 有参构造方法【建议】
    public StudentJavabean(String name, int age){
        this.name = name;
        this.age = age;
    }
    // 成员方法
    // getxxx()
    public String getName(){
        return name;
    }
    public int getAge(){
        return age;
    }
    // setxxx()
    public void setName(String name){
        this.name = name;
    }
    public void setAge(int age){
        this.age = age;
    }
}
