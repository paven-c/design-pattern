package com.paven.creatation.$02_prototype.factory;

import com.google.common.collect.Maps;
import com.paven.creatation.$02_prototype.model.Car;
import com.paven.creatation.$02_prototype.model.Engine;

import java.util.HashMap;

/**
 * @author pavenchen
 */
public class CarFactory {

    private static final HashMap<String, Car> CAR_TEMPLATE = Maps.newHashMap();

    public static void initTemplate() {
        Car car1 = new Car();
        car1.setBrand("Tesla");
        car1.setType("Model 3");
        car1.setEngine(new Engine("电动机"));
        CAR_TEMPLATE.put(car1.getType(), car1);

        Car car2 = new Car();
        car2.setBrand("Tesla");
        car2.setType("Model Y");
        car2.setEngine(new Engine("电动机"));
        CAR_TEMPLATE.put(car2.getType(), car2);
    }

    public static Car getCar(String type) {
        Car template = CAR_TEMPLATE.get(type);
        return template.clone();
    }
}
