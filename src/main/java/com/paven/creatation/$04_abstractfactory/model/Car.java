package com.paven.creatation.$04_abstractfactory.model;

/**
 * @author pavenchen
 */
public abstract class Car {

    protected String name;
    protected String type;
    protected String engine;

    public void run() {
        System.out.println(this.name + " " + this.type + " " + this.engine);
    }
}
