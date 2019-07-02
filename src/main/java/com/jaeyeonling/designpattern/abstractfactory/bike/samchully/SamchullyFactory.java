package com.jaeyeonling.designpattern.abstractfactory.bike.samchully;

import com.jaeyeonling.designpattern.abstractfactory.bike.common.BikeFactory;
import com.jaeyeonling.designpattern.abstractfactory.bike.common.Body;
import com.jaeyeonling.designpattern.abstractfactory.bike.common.Wheel;

public class SamchullyFactory implements BikeFactory {

    @Override
    public Body createBody() {
        return new SamchullyBody();
    }

    @Override
    public Wheel createWheel() {
        return new SamchullyWheel();
    }
}
