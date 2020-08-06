package com.neusoft.JDBC.studentAdmin.domain;

/**
 * @author shihaobo
 * @date 2020/8/6 15:49
 */
/*  `id` int(10) NOT NULL AUTO_INCREMENT COMMENT '学生id',
          `name` varchar(20) NOT NULL COMMENT '学生姓名',
          `gender` varchar(6) DEFAULT NULL COMMENT '性别',
          `score` int(5) DEFAULT NULL COMMENT '学生成绩',
          `addr` varchar(20) DEFAULT NULL COMMENT '地址',
          `tel` varchar(20) DEFAULT NULL COMMENT '电话',*/
public class Student {
    private Integer id;
    private String name;
    private String gender;
    private Integer score;
    private String address;
    private String phone;

    public Student() {
    }

    public Student(Integer id, String name, String gender, Integer score, String address, String phone) {
        this.id = id;
        this.name = name;
        this.gender = gender;
        this.score = score;
        this.address = address;
        this.phone = phone;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public Integer getScore() {
        return score;
    }

    public void setScore(Integer score) {
        this.score = score;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", gender='" + gender + '\'' +
                ", score=" + score +
                ", address='" + address + '\'' +
                ", phone='" + phone + '\'' +
                '}';
    }
}
