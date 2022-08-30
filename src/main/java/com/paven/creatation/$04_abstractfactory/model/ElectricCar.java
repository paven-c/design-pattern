package com.paven.creatation.$04_abstractfactory.model;

import lombok.Data;

/**
 * @author pavenchen
 */
@Data
public class ElectricCar extends Car {

    public ElectricCar() {
        this.type = "电动车";
        this.engine = "电动机";
    }
}
