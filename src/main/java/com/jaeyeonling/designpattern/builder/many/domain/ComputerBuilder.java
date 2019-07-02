package com.jaeyeonling.designpattern.builder.many.domain;

import com.jaeyeonling.designpattern.builder.common.CPU;
import com.jaeyeonling.designpattern.builder.common.RAM;
import com.jaeyeonling.designpattern.builder.common.Storage;

public class ComputerBuilder {

    private CPU cpu;
    private RAM ram;
    private Storage storage;

    public ComputerBuilder setCpu(final CPU cpu) {
        this.cpu = cpu;
        return this;
    }

    public ComputerBuilder setRam(final RAM ram) {
        this.ram = ram;
        return this;
    }

    public ComputerBuilder setStorage(final Storage storage) {
        this.storage = storage;
        return this;
    }

    CPU getCpu() {
        return cpu;
    }

    RAM getRam() {
        return ram;
    }

    Storage getStorage() {
        return storage;
    }

    public Computer build() {
        return new Computer(this);
    }
}
