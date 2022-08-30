package com.paven.creatation.$03_simplefactory.enums;

/**
 * @author pavenchen
 */
public enum CarType {
    /**
     * BUS
     */
    BUS("BUS"),

    /**
     * JEEP
     */
    JEEP("JEEP");

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
