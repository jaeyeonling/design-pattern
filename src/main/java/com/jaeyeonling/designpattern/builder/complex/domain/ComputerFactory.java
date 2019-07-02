package com.jaeyeonling.designpattern.builder.complex.domain;

public class ComputerFactory {

    private final BluePrint bluePrint;

    public ComputerFactory(final BluePrint bluePrint) {
        this.bluePrint = bluePrint;
    }

    public Computer make() {
        return new Computer(bluePrint.getCPU(), bluePrint.getRAM(), bluePrint.getStorage());
    }
}
