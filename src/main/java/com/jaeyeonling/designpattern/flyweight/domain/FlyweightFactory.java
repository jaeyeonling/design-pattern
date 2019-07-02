package com.jaeyeonling.designpattern.flyweight.domain;

import java.util.HashMap;
import java.util.Map;

public class FlyweightFactory<T> {

    private final Map<T, Flyweight<T>> POOL = new HashMap<>();

    public Flyweight<T> getFlyweight(final T key) {
        return POOL.computeIfAbsent(key, Flyweight::new);
    }
}
