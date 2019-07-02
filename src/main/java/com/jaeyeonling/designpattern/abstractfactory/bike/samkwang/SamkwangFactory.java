package com.jaeyeonling.designpattern.abstractfactory.bike.samkwang;

import com.jaeyeonling.designpattern.abstractfactory.bike.common.BikeFactory;
import com.jaeyeonling.designpattern.abstractfactory.bike.common.Body;
import com.jaeyeonling.designpattern.abstractfactory.bike.common.Wheel;

public class SamkwangFactory implements BikeFactory {

    @Override
    public Body createBody() {
        return new SamkwangBody();
    }

    @Override
    public Wheel createWheel() {
        return new SamkwangWheel();
    }
}
