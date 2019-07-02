package com.jaeyeonling.designpattern.strategy;

class Character {

    private Weapon weapon;

    Character(final Weapon weapon) {
        this.weapon = weapon;
    }

    void changeWeapon(final Weapon weapon) {
        this.weapon = weapon;
    }

    void attack() {
        weapon.attack();
    }
}
