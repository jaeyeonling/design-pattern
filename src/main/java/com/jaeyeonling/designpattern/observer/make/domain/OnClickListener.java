package com.jaeyeonling.designpattern.observer.make.domain;

@FunctionalInterface
public interface OnClickListener<T> {

    void onClick(final T item);
}
