package com.paven.creatation.$03_simplefactory;


import com.paven.creatation.$03_simplefactory.enums.CarType;
import com.paven.creatation.$03_simplefactory.model.Car;

/**
 * @author pavenchen
 */
public class SimpleFactoryDemo {
    public static void main(String[] args) {
        SimpleFactory factory = new SimpleFactory();
        Car car1 = factory.getCar(CarType.BUS.getValue());
        car1.run();
        Car car2 = factory.getCar(CarType.JEEP.getValue());
        car2.run();
    }
}
