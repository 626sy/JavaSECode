package com.neusoft.homwwork1;

import java.util.ArrayList;

/**
 * @author shihaobo
 * @date 2020/6/14 20:19
 */
public class Course extends Teacher {

    private String name;

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    public void show(Teacher teacher){
        System.out.println("课程名称： " + this.name);
        System.out.println("授课老师： " + teacher.getName());
    }
}
