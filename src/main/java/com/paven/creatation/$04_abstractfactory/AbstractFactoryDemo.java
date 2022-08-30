package com.paven.creatation.$04_abstractfactory;

import com.paven.creatation.$04_abstractfactory.enums.CarType;
import com.paven.creatation.$04_abstractfactory.enums.FactoryType;
import com.paven.creatation.$04_abstractfactory.model.ElectricCar;
import com.paven.creatation.$04_abstractfactory.model.PetrolCar;
import com.paven.creatation.$04_abstractfactory.model.factory.AbstractFactory;
import com.paven.creatation.$04_abstractfactory.model.factory.FactoryProducer;

/**
 * 抽象工厂是在工厂模式的基础上进一步的抽象，其中有连个主要概念，产品族与产品线。
 * 产品族：指不同种类的产品，每种工厂生成对应种类的产品。
 * 产品线：指不同型号的同类产品，每个工厂生成对应型号的产品。
 *
 * @author pavenchen
 */
public class AbstractFactoryDemo {
    public static void main(String[] args) {
        AbstractFactory electricFactory = FactoryProducer.getFactory(FactoryType.ELECTRIC);
        ElectricCar electricCar1 = electricFactory.getElectricCar(CarType.CAR);
        electricCar1.run();
        ElectricCar electricCar2 = electricFactory.getElectricCar(CarType.SUV);
        electricCar2.run();

        AbstractFactory petrolFactory = FactoryProducer.getFactory(FactoryType.PETROL);
        PetrolCar petrolCar1 = petrolFactory.getPetrolCar(CarType.CAR);
        petrolCar1.run();
        PetrolCar petrolCar2 = petrolFactory.getPetrolCar(CarType.SUV);
        petrolCar2.run();
    }
}
