package com.paven.creatation.$02_prototype;

import com.paven.creatation.$02_prototype.factory.CarFactory;
import com.paven.creatation.$02_prototype.model.Car;

/**
 * @author pavenchen
 */
public class ProtoTypeDemo {

    public static void main(String[] args) {
        /**
         * 1.初始化原始对象并缓存
         * 2.通过key获取原型对象
         * 3.通过原型对象克隆并返回克隆对象
         */
        CarFactory.initTemplate();
        Car car1 = CarFactory.getCar("Model 3");
        Car car2 = CarFactory.getCar("Model 3");
        // false
        System.out.println(car1 == car2);
        // true 非深度克隆
        System.out.println(car1.getEngine() == car2.getEngine());
    }
}
