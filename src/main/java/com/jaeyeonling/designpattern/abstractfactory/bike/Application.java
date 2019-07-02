package com.jaeyeonling.designpattern.abstractfactory.bike;

import com.jaeyeonling.designpattern.abstractfactory.bike.common.BikeFactory;
import com.jaeyeonling.designpattern.abstractfactory.bike.common.Body;
import com.jaeyeonling.designpattern.abstractfactory.bike.common.Wheel;
import com.jaeyeonling.designpattern.abstractfactory.bike.samchully.SamchullyFactory;

public class Application {

    public static void main(final String... args) {
        // final BikeFactory factory = new SamkwangFactory();
        final BikeFactory factory = new SamchullyFactory();

        final Body body = factory.createBody();
        final Wheel wheel = factory.createWheel();

        System.out.println(body.getClass());
        System.out.println(wheel.getClass());
    }
}
