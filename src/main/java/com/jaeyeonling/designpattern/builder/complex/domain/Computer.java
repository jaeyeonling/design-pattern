package com.jaeyeonling.designpattern.builder.complex.domain;

import com.jaeyeonling.designpattern.builder.common.CPU;
import com.jaeyeonling.designpattern.builder.common.RAM;
import com.jaeyeonling.designpattern.builder.common.Storage;

public class Computer {

    private final CPU cpu;
    private final RAM ram;
    private final Storage storage;

    public Computer(final CPU cpu,
                    final RAM ram,
                    final Storage storage) {
        this.cpu = cpu;
        this.ram = ram;
        this.storage = storage;
    }

    @Override
    public String toString() {
        return "Computer{" +
                "cpu=" + cpu +
                ", ram=" + ram +
                ", storage=" + storage +
                '}';
    }
}
