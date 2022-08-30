package com.paven.creatation.$01_singleton;

/**
 * 优点：线程安全、懒加载，不占用内存
 * 缺点：实现略复杂
 *
 * @author paven
 */
public class SingleObjectLazy {
    /**
     * volatile防止new对象的指令重排导致返回未初始化完成的对象。
     * <p>
     * new 对象的步骤：
     * 1. 分配内存
     * 2. 构造方法初始化对象
     * 3. 对象引用赋值变量
     * 2、3会发生指令重排，线程1指令重排1、3、2，先给变量赋值但对象尚未初始化。线程2获取锁，判断对象不为空直接返回，但是对象尚未完成初始化。
     */
    private volatile static SingleObjectLazy instance;

    /**
     * 私有化构造方法
     */
    private SingleObjectLazy() {
    }

    /**
     * 获取单一实例
     *
     * @return 单一实例
     */
    public static SingleObjectLazy getInstance() {
        // 判断变量是否初始化
        if (instance == null) {
            // 加锁
            synchronized (SingleObjectLazy.class) {
                // 线程获取锁后再次判断变量是否初始化
                if (instance == null) {
                    instance = new SingleObjectLazy();
                }
            }
        }
        return instance;
    }
}
