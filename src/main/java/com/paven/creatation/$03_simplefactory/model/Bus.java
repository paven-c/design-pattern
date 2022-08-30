package com.paven.creatation.$03_simplefactory.model;

import com.paven.creatation.$03_simplefactory.enums.CarType;

/**
 * @author pavenchen
 */
public class Bus extends Car {

    public Bus() {
        this.type = CarType.BUS.getValue();
        this.engine = new Engine("柴油发动机");
    }
}
