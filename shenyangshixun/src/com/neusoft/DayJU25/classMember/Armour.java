package com.neusoft.DayJU25.classMember;

/**
 * @author shihaobo
 * @date 2020/7/25 14:12
 */
public class Armour {
    //装备名称
    private String name;
    //防御值
    private int protect;

    public Armour(String name, int protect) {
        this.name = name;
        this.protect = protect;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getProtect() {
        return protect;
    }

    public void setProtect(int protect) {
        this.protect = protect;
    }
}
