package com.jaeyeonling.designpattern.builder.complex.domain;

import com.jaeyeonling.designpattern.builder.common.CPU;
import com.jaeyeonling.designpattern.builder.common.RAM;
import com.jaeyeonling.designpattern.builder.common.Storage;

public class LGComputerBluePrint extends BluePrint {

    @Override
    CPU getCPU() {
        return new CPU("LG CPU");
    }

    @Override
    RAM getRAM() {
        return new RAM("LG RAM");
    }

    @Override
    Storage getStorage() {
        return new Storage("LG Storage");
    }
}
