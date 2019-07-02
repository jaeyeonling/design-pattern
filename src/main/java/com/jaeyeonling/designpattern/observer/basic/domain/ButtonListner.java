package com.jaeyeonling.designpattern.observer.basic.domain;

import java.util.Observable;
import java.util.Observer;

public class ButtonListner implements Observer {

    @Override
    public void update(final Observable o,
                       final Object arg) {
        System.out.println(o + " | " + arg + " | Clicked");
    }
}
