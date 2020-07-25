package com.neusoft.DayJU25.classMember;

/**
 * @author shihaobo
 * @date 2020/7/25 14:12
 */
public class Weapon {
    // 武器名
    private String name;
    // 伤害值
    private int hurt;

    public Weapon(String name, int hurt) {
        this.name = name;
        this.hurt = hurt;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHurt() {
        return hurt;
    }

    public void setHurt(int hurt) {
        this.hurt = hurt;
    }
}
