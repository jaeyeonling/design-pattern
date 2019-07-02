package com.jaeyeonling.designpattern.state;

import com.jaeyeonling.designpattern.state.domain.Light;

public class Application {

    public static void main(final String... args) {
        final Light light = new Light();

        light.on();
        light.on();
        light.on();

        light.off();
        light.off();
        light.off();

        light.on();
        light.on();
        light.on();

        light.off();
        light.on();
        light.off();
        light.on();
        light.off();
        light.on();
    }
}
