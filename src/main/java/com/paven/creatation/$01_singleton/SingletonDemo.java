package com.paven.creatation.$01_singleton;

/**
 * @author pavenchen
 */
public class SingletonDemo {
    public static void main(String[] args) {
        SingleObjectEnum instance1 = SingleObjectEnum.getInstance();
        SingleObjectEnum instance2 = SingleObjectEnum.getInstance();
        System.out.println("SingleObjectEnum equals:" + (instance1 == instance2));


        SingleObjectHungry instance3 = SingleObjectHungry.getInstance();
        SingleObjectHungry instance4 = SingleObjectHungry.getInstance();
        System.out.println("SingleObjectHungry equals:" + (instance3 == instance4));

        SingleObjectLazy instance5 = SingleObjectLazy.getInstance();
        SingleObjectLazy instance6 = SingleObjectLazy.getInstance();
        System.out.println("SingleObjectLazy equals:" + (instance5 == instance6));

    }
}
