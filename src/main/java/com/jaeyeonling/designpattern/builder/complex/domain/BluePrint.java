package com.jaeyeonling.designpattern.builder.complex.domain;

import com.jaeyeonling.designpattern.builder.common.CPU;
import com.jaeyeonling.designpattern.builder.common.RAM;
import com.jaeyeonling.designpattern.builder.common.Storage;

public abstract class BluePrint {

    abstract CPU getCPU();
    abstract RAM getRAM();
    abstract Storage getStorage();
}
