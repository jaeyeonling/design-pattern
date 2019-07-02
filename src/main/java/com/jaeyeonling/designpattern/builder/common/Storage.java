package com.jaeyeonling.designpattern.builder.common;

public class Storage {

    private final String name;

    public Storage(final String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Storage{" +
                "name='" + name + '\'' +
                '}';
    }
}
