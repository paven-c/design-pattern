package com.paven.creatation.$01_singleton;

/**
 * 优点：线程安全、无锁效率高
 * 缺点：类加载就初始化，占用内存
 *
 * @author paven
 */
public class SingleObjectHungry {
    /**
     * 饿汉式在类加载是就完成实例化
     */
    private static final SingleObjectHungry INSTANCE = new SingleObjectHungry();

    /**
     * 私有构造方法
     */
    private SingleObjectHungry() {
    }

    /**
     * 获取单一实例
     *
     * @return 单一实例
     */
    public static SingleObjectHungry getInstance() {
        return INSTANCE;
    }
}
