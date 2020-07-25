package com.neusoft.DayJU25.classMember.wangzherongyao;

/**
 * @author shihaobo
 * @date 2020/7/25 14:27
 */
public class WangZheTest {
    public static void main(String[] args) {

        WangZheRole role = new WangZheRole();

        // 设置角色的法术技能
        role.setFaShuSkill(new FaShuSkill() {
            @Override
            public void faShuAttack() {
                System.out.println("发射爱心");
            }
        });

        // 发送法术攻击
        role.faShuSkillAttack();


        // 更换技能
        role.setFaShuSkill(new FaShuSkill() {
            @Override
            public void faShuAttack() {
                System.out.println("发射烤羊肉串");
            }
        });
        // 发送法术攻击
        role.faShuSkillAttack();
    }
}
