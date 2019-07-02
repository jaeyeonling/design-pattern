package com.jaeyeonling.designpattern.abstractfactory.bike.common;

public interface BikeFactory {

    Body createBody();
    Wheel createWheel();
}
