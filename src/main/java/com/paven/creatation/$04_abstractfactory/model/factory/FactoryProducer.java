package com.paven.creatation.$04_abstractfactory.model.factory;

import com.paven.creatation.$04_abstractfactory.enums.FactoryType;

/**
 * @author pavenchen
 */
public class FactoryProducer {

    public static AbstractFactory getFactory(FactoryType factoryType) {
        if (FactoryType.ELECTRIC.equals(factoryType)) {
            return new ElectricFactory();
        } else if (FactoryType.PETROL.equals(factoryType)) {
            return new PetrolCarFactory();
        }
        throw new IllegalArgumentException();
    }
}
