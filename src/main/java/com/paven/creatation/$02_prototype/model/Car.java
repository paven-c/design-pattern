package com.paven.creatation.$02_prototype.model;

import lombok.Data;

/**
 * @author pavenchen
 */
@Data
public class Car implements Cloneable {

    private String brand;
    private String type;
    private Engine engine;

    @Override
    public Car clone() {
        try {
            return (Car) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new AssertionError();
        }
    }
}
