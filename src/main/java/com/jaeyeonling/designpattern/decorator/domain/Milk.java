package com.jaeyeonling.designpattern.decorator.domain;

import com.jaeyeonling.designpattern.decorator.Money;

public class Milk extends Adding {

    private static final Money PRICE = Money.of(50);

    public Milk(final Beverage material) {
        super(material);
    }

    @Override
    public Money totalPrice() {
        return super.totalPrice().add(PRICE);
    }
}
