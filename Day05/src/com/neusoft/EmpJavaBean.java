package com.neusoft;

/**
 * @author shihaobo
 * @date 2020/5/10 14:59
 * get,set快捷键alt+insert
 */
public class EmpJavaBean {
    //员工姓名
    private String name;
    //工号
    private int jobnumber;
    //职位
    private String position;
    //薪资
    private int salary;
    //有参
    public EmpJavaBean(String name, int jobnumber, String position, int salary){
        this.name = name;
        this.jobnumber = jobnumber;
        this.position = position;
        this.salary = salary;
    }
    //无参
    public EmpJavaBean(){

    }
    //编写对应的测试类
    public String getName(){
        return name;
    }
    public int getJobnumber(){
        return jobnumber;
    }
    public String getPosition(){
        return position;
    }

    public int getSalary() {
        return salary;
    }


    public void setName(String name){
        this.name = name;
    }

    public void setJobnumber(int jobnumber) {
        this.jobnumber = jobnumber;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

}
