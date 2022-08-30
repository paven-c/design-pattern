package com.paven.creatation.$01_singleton;

/**
 * 优点：线程安全、防止反序列化创建新对象
 *
 * @author paven
 */
public enum SingleObjectEnum {
    /**
     * 枚举常量
     */
    INSTANCE;

    public static SingleObjectEnum getInstance() {
        return INSTANCE;
    }
}
