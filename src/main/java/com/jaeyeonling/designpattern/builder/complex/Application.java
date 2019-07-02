package com.jaeyeonling.designpattern.builder.complex;

import com.jaeyeonling.designpattern.builder.complex.domain.ComputerFactory;
import com.jaeyeonling.designpattern.builder.complex.domain.LGComputerBluePrint;
import com.jaeyeonling.designpattern.builder.complex.domain.SamsungComputerBluePrint;

public class Application {

    public static void main(final String... args) {
        final ComputerFactory lgFactory = new ComputerFactory(new LGComputerBluePrint());
        final ComputerFactory samsungFactory = new ComputerFactory(new SamsungComputerBluePrint());

        System.out.println(lgFactory.make());
        System.out.println(samsungFactory.make());
        System.out.println(lgFactory.make());
        System.out.println(samsungFactory.make());
    }
}
