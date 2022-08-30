package com.paven.creatation.$03_simplefactory.model;

import com.paven.creatation.$03_simplefactory.enums.CarType;

/**
 * @author pavenchen
 */
public class Jeep extends Car {

    public Jeep() {
        this.type = CarType.JEEP.getValue();
        this.engine = new Engine("四缸发动机");
    }
}
