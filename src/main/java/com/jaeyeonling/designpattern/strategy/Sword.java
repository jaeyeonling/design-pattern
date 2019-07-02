package com.jaeyeonling.designpattern.strategy;

public class Sword implements Weapon {

    @Override
    public void attack() {
        System.out.println("Sword 공격!");
    }
}
