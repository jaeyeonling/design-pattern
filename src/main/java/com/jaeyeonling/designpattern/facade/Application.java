package com.jaeyeonling.designpattern.facade;

import com.jaeyeonling.designpattern.facade.domain.Facade;

public class Application {

    public static void main(final String... args) {
        final Facade facade = new Facade();

        facade.process();
    }
}
