package com.paven.creatation.$03_simplefactory.model;

import lombok.Data;

/**
 * @author pavenchen
 */
@Data
public class Engine {

    String name;

    public Engine(String name) {
        this.name = name;
    }
}
