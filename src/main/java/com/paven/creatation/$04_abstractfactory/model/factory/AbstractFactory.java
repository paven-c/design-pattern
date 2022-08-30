package com.paven.creatation.$04_abstractfactory.model.factory;

import com.paven.creatation.$04_abstractfactory.enums.CarType;
import com.paven.creatation.$04_abstractfactory.model.ElectricCar;
import com.paven.creatation.$04_abstractfactory.model.PetrolCar;

/**
 * @author pavenchen
 */
public abstract class AbstractFactory {

    public abstract PetrolCar getPetrolCar(CarType carType);

    public abstract ElectricCar getElectricCar(CarType carType);
}
