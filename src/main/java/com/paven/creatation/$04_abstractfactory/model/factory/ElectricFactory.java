package com.paven.creatation.$04_abstractfactory.model.factory;

import com.paven.creatation.$04_abstractfactory.enums.CarType;
import com.paven.creatation.$04_abstractfactory.model.ElectricCar;
import com.paven.creatation.$04_abstractfactory.model.Es8;
import com.paven.creatation.$04_abstractfactory.model.Et7;
import com.paven.creatation.$04_abstractfactory.model.PetrolCar;
import com.sun.xml.internal.ws.addressing.model.ActionNotSupportedException;

/**
 * @author pavenchen
 */
public class ElectricFactory extends AbstractFactory {
    @Override
    public PetrolCar getPetrolCar(CarType carType) {
        throw new ActionNotSupportedException("can not create petrol car.");
    }

    @Override
    public ElectricCar getElectricCar(CarType carType) {
        if (CarType.SUV.equals(carType)) {
            return new Es8();
        } else if (CarType.CAR.equals(carType)) {
            return new Et7();
        }
        throw new IllegalArgumentException();
    }
}
