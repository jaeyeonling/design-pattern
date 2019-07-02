package com.jaeyeonling.designpattern.chainofresponsibility.war.domain;

public class Attack {

    private int damage;

    public Attack(int damage) {
        this.damage = damage;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(final int damage) {
        this.damage = Math.max(damage, 0);
    }

    @Override
    public String toString() {
        return "Attack{" +
                "damage=" + damage +
                '}';
    }
}
