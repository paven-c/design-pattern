package com.paven.creatation.$04_abstractfactory.model.factory;

import com.paven.creatation.$04_abstractfactory.enums.CarType;
import com.paven.creatation.$04_abstractfactory.model.Accord;
import com.paven.creatation.$04_abstractfactory.model.Crv;
import com.paven.creatation.$04_abstractfactory.model.ElectricCar;
import com.paven.creatation.$04_abstractfactory.model.PetrolCar;
import com.sun.xml.internal.ws.addressing.model.ActionNotSupportedException;

/**
 * @author pavenchen
 */
public class PetrolCarFactory extends AbstractFactory {

    @Override
    public PetrolCar getPetrolCar(CarType carType) {
        if (CarType.SUV.equals(carType)) {
            return new Crv();
        } else if (CarType.CAR.equals(carType)) {
            return new Accord();
        }
        throw new IllegalArgumentException();
    }

    @Override
    public ElectricCar getElectricCar(CarType carType) {
        throw new ActionNotSupportedException("can not create electric car.");
    }

}
