package com.neusoft.Day10.duotai;

/**
 * @author shihaobo
 * @date 2020/7/24 11:11
 */
public class TestDy {
    public static void main(String[] args) {
//        // 使用多态方式
//        Animal a1 = new Cat();
//        //执行的是子类重写后方法
//        a1.eat();
//        Animal a2 = new Dog();
//        a2.eat();

        Cat c = new Cat();
        Dog d = new Dog();
        showCatEat(c);
        showDogEat(d);
        // 以上两个方法，均可以被showAnimalEat(Animal animal)方法替代
        //执行效果一致
        //在实际的开发过程中，父类类型作为方法的形式参数，传递子类对象给方法
        // 执行方法的调用，更能体现多态多态的扩展性和遍历性。
        showAnimalEat(c);
        showAnimalEat(d);

    }
    public static void showCatEat(Cat cat){
        cat.eat();
    }
    public static void showDogEat(Dog dog){
        dog.eat();
    }
    public static void showAnimalEat(Animal animal){
        animal.eat();
    }



}
