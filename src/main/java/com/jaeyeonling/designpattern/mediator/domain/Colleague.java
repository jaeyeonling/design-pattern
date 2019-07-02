package com.jaeyeonling.designpattern.mediator.domain;

public abstract class Colleague<T> {

    private final Mediator<T> mediator;

    Colleague(final Mediator<T> mediator) {
        this.mediator = mediator;
        mediator.addColleague(this);
    }

    public void sendData(final T data) {
        mediator.mediate(data);
    }

    abstract public void handle(final T data);
}
