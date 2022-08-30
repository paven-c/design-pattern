package com.paven.creatation.$04_abstractfactory.enums;

/**
 * @author pavenchen
 */

public enum FactoryType {
    /**
     * ELECTRIC
     */
    ELECTRIC("ELECTRIC"),

    /**
     * PETROL
     */
    PETROL("PETROL");

    FactoryType(String key) {
        this.key = key;
    }

    private String key;

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }
}
