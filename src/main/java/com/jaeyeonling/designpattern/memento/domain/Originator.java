package com.jaeyeonling.designpattern.memento.domain;

public class Originator<T> {

    private T state;

    public Originator(final T state) {
        this.state = state;
    }

    public Memento<T> createMemento() {
        return new Memento<>(state);
    }

    public void restoreMemento(final Memento<T> memento) {
        this.state = memento.getState();
    }

    public void setState(T state) {
        this.state = state;
    }

    @Override
    public String toString() {
        return "Originator{" +
                "state=" + state +
                '}';
    }
}
