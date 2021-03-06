package com.neusoft.DayJU25.classMember;

/**
 * @author shihaobo
 * @date 2020/7/25 11:42
 */
public class Role {
    private int id; // 角色id
    private int blood; //角色值
    private String name; // 角色名

    // 添加武器属性
    private Weapon wp;

    // 添加盔甲属性
    private Armour ar;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getBlood() {
        return blood;
    }

    public void setBlood(int blood) {
        this.blood = blood;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Weapon getWp() {
        return wp;
    }

    public void setWp(Weapon wp) {
        this.wp = wp;
    }

    public Armour getAr() {
        return ar;
    }

    public void setAr(Armour ar) {
        this.ar = ar;
    }
    // 攻击方法
    public void attack(){
        System.out.println("使用"+wp.getName() + ",造成"+wp.getHurt()
                +"点伤害");
    }
    // 穿戴盔甲
    public void wear(){
        //增加血量
        this.blood += ar.getProtect();
        System.out.println("穿上"+ar.getName()+",生命值增加"+ar.getProtect());
    }

}


