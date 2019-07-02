package com.jaeyeonling.designpattern.observer.basic.domain;

import java.util.Observable;

public class Button extends Observable {

    public void onClick() {
        setChanged();
        notifyObservers();
    }
}
