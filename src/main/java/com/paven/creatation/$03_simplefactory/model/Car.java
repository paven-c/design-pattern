package com.paven.creatation.$03_simplefactory.model;

/**
 * @author pavenchen
 */
public abstract class Car {

    protected String type;

    protected Engine engine;

    public void run() {
        System.out.println(this.type + " " + this.engine.getName());
    }
}
