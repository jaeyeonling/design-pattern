package com.jaeyeonling.designpattern.chainofresponsibility.war;

import com.jaeyeonling.designpattern.chainofresponsibility.war.domain.Armor;
import com.jaeyeonling.designpattern.chainofresponsibility.war.domain.Attack;

public class Application {

    public static void main(final String... args) {
        final Attack attack = new Attack(100);

        final Armor armor1 = new Armor(10);
        final Armor armor2 = new Armor(20);
        final Armor armor3 = new Armor(30);

        armor1.setNextDefensible(armor2);
        armor2.setNextDefensible(armor3);

        armor1.defense(attack);

        System.out.println(attack);
    }
}
