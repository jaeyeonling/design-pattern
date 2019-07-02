package com.jaeyeonling.designpattern.decorator.domain;

import com.jaeyeonling.designpattern.decorator.Money;

public class Base implements Beverage {

    private static final Money PRICE = Money.of(100);

    @Override
    public Money totalPrice() {
        return PRICE;
    }
}
