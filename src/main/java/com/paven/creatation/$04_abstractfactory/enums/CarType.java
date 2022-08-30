package com.paven.creatation.$04_abstractfactory.enums;

/**
 * @author pavenchen
 */
public enum CarType {
    /**
     * SUV
     */
    SUV("SUV"),

    /**
     * CAR
     */
    CAR("CAR");

    private String value;

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    CarType(String value) {
        this.value = value;
    }
}
