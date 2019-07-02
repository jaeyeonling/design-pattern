package com.jaeyeonling.designpattern.decorator.domain;

import com.jaeyeonling.designpattern.decorator.Money;

public class Espresso extends Adding {

    private static final Money DEFAULT_PRICE = Money.of(100);
    private static final Money DISCOUNT_PRICE = Money.of(70);

    private static int count = 0;

    public Espresso(final Beverage base) {
        super(base);
    }

    @Override
    public Money totalPrice() {
        return super.totalPrice().add(getAddPrice());
    }

    private static Money getAddPrice() {
        if (++count > 1) {
            return DEFAULT_PRICE;
        }

        return DISCOUNT_PRICE;
    }
}
