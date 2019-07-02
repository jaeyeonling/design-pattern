package com.jaeyeonling.designpattern.chainofresponsibility.war.domain;

import java.util.Objects;

public class Armor implements Defensible {

    private final int defense;

    private Defensible nextDefensible;

    public Armor(final int defense) {
        this.defense = defense;
    }

    public void setNextDefensible(final Defensible nextDefensible) {
        this.nextDefensible = nextDefensible;
    }

    @Override
    public void defense(final Attack attack) {
        process(attack);

        if (Objects.nonNull(nextDefensible)) {
            nextDefensible.defense(attack);
        }
    }

    private void process(final Attack attack) {
        attack.setDamage(attack.getDamage() - defense);
    }
}
