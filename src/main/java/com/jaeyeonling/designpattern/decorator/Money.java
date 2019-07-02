package com.jaeyeonling.designpattern.decorator;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class Money {

    private static final Map<Long, Money> CACHE = new HashMap<>();

    private final long balance;

    private Money(final long balance) {
        this.balance = balance;
    }

    public static Money of(final long balance) {
        return CACHE.computeIfAbsent(balance, Money::new);
    }

    @Override
    public boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof Money)) {
            return false;
        }

        final Money that = (Money) o;
        return this.balance == that.balance;
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.balance);
    }

    public Money add(final Money other) {
        return Money.of(this.balance + other.balance);
    }

    @Override
    public String toString() {
        return balance + "원";
    }
}
