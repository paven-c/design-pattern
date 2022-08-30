package com.paven.creatation.$03_simplefactory;

import com.paven.creatation.$03_simplefactory.enums.CarType;
import com.paven.creatation.$03_simplefactory.model.Bus;
import com.paven.creatation.$03_simplefactory.model.Car;
import com.paven.creatation.$03_simplefactory.model.Jeep;

/**
 * 对于产品比较少的情况可以使用简单工厂：
 * 1.创建产品抽象类，定义属性及通用方法
 * 2.创建产品实现接口并实现通用方法
 * 3.需要产品是通过工厂指定产品类型并创建产品
 *
 * @author pavenchen
 */
public class SimpleFactory {

    public Car getCar(String type) {
        if (CarType.BUS.getValue().equals(type)) {
            return new Bus();
        } else if (CarType.JEEP.getValue().equals(type)) {
            return new Jeep();
        }
        return null;
    }
}
