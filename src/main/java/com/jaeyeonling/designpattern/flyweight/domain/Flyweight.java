package com.jaeyeonling.designpattern.flyweight.domain;

public class Flyweight<T> {

    private final T data;

    Flyweight(final T data) {
        System.out.println(data + " | 새로 생성됨");
        this.data = data;
    }

    @Override
    public String toString() {
        return "Flyweight{" +
                "data=" + data +
                '}';
    }
}
