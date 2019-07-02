package com.jaeyeonling.designpattern.factorymethod.framework;

public class HpPotion implements Item {

    @Override
    public void use() {
        System.out.println("HP 물약 먹음");
    }
}
