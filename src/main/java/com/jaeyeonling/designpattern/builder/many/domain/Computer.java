package com.jaeyeonling.designpattern.builder.many.domain;

import com.jaeyeonling.designpattern.builder.common.CPU;
import com.jaeyeonling.designpattern.builder.common.RAM;
import com.jaeyeonling.designpattern.builder.common.Storage;

public class Computer {

    private final CPU cpu;
    private final RAM ram;
    private final Storage storage;

    public Computer(final ComputerBuilder computerBuilder) {
        this.cpu = computerBuilder.getCpu();
        this.ram = computerBuilder.getRam();
        this.storage = computerBuilder.getStorage();
    }

    public static ComputerBuilder builder() {
        return new ComputerBuilder();
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
