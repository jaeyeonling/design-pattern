package com.jaeyeonling.designpattern.memento.domain;

public class Memento<T> {

    private final T state;

    Memento(final T state) {
        this.state = state;
    }

    T getState() {
        return state;
    }
}
