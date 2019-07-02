package com.jaeyeonling.designpattern.builder.common;

public class RAM {

    private final String name;

    public RAM(final String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "RAM{" +
                "name='" + name + '\'' +
                '}';
    }
}
