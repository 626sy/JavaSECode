package com.neusoft.homwwork1;

/**
 * @author shihaobo
 * @date 2020/6/14 20:18
 */
public class Teacher extends Student{
    private String name;

    public void chuqin(Student student){
        if (student.isChuqin()){
            System.out.println( student.getName() + " 上课" );
        }else{
            System.out.println( student.getName() + " 旷课" );
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }




}
