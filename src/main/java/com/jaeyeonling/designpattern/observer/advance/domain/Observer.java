package com.jaeyeonling.designpattern.observer.advance.domain;

@FunctionalInterface
public interface Observer<T> {

    void update(final Observable o, final T arg);
}
