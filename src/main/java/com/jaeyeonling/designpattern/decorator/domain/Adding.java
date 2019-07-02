package com.jaeyeonling.designpattern.decorator.domain;

import com.jaeyeonling.designpattern.decorator.Money;

public abstract class Adding implements Beverage {

    private final Beverage base;

    Adding(final Beverage base) {
        this.base = base;
    }

    @Override
    public Money totalPrice() {
        return base.totalPrice();
    }
}
