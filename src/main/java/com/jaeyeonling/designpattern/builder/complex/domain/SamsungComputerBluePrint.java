package com.jaeyeonling.designpattern.builder.complex.domain;

import com.jaeyeonling.designpattern.builder.common.CPU;
import com.jaeyeonling.designpattern.builder.common.RAM;
import com.jaeyeonling.designpattern.builder.common.Storage;

public class SamsungComputerBluePrint extends BluePrint {

    @Override
    CPU getCPU() {
        return new CPU("Samsung CPU");
    }

    @Override
    RAM getRAM() {
        return new RAM("Samsung RAM");
    }

    @Override
    Storage getStorage() {
        return new Storage("Samsung Storage");
    }
}
