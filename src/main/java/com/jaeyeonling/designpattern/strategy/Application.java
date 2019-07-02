package com.jaeyeonling.designpattern.strategy;

public class Application {

    public static void main(final String... args) {
        final Weapon knife = new Knife();
        final Weapon sword = new Sword();


        final Character user = new Character(knife);
        user.attack();

        user.changeWeapon(sword);
        user.attack();
    }
}
