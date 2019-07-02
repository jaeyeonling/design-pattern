package com.jaeyeonling.designpattern.strategy;

public class Knife implements Weapon {

    @Override
    public void attack() {
        System.out.println("Knife 공격!");
    }
}
