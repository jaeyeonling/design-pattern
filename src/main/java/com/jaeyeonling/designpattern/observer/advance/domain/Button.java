package com.jaeyeonling.designpattern.observer.advance.domain;

public class Button {

    private final Observable<String> observable;

    public Button(final Observable<String> observable) {
        this.observable = observable;
    }

    public void addObserver(final Observer<String> observer) {
        observable.addObserver(observer);
    }

    public void notifyObservers() {
        observable.notifyObservers();
    }

    public void click() {
        observable.setChanged();
        notifyObservers();
    }
}
