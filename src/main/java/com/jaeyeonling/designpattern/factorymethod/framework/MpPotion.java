package com.jaeyeonling.designpattern.factorymethod.framework;

public class MpPotion implements Item {

    @Override
    public void use() {
        System.out.println("MP 물약 먹음");
    }
}
