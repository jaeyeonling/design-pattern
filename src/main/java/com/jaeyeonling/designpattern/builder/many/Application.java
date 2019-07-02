package com.jaeyeonling.designpattern.builder.many;

import com.jaeyeonling.designpattern.builder.common.CPU;
import com.jaeyeonling.designpattern.builder.common.RAM;
import com.jaeyeonling.designpattern.builder.common.Storage;
import com.jaeyeonling.designpattern.builder.many.domain.Computer;

public class Application {

    public static void main(final String... args) {
        final Computer computer = Computer.builder()
                .setCpu(new CPU("CPU"))
                .setRam(new RAM("RAM"))
                .setStorage(new Storage("Storage"))
                .build();

        System.out.println(computer);
    }
}
