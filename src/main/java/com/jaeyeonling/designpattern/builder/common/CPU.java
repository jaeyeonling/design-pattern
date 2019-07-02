package com.jaeyeonling.designpattern.builder.common;

public class CPU {

    private final String name;

    public CPU(final String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "CPU{" +
                "name='" + name + '\'' +
                '}';
    }
}
