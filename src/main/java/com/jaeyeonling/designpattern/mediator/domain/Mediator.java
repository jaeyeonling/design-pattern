package com.jaeyeonling.designpattern.mediator.domain;

import java.util.ArrayList;
import java.util.List;

public abstract class Mediator<T> {

    private final List<Colleague<T>> colleagues = new ArrayList<>();

    boolean addColleague(final Colleague<T> colleague) {
        return this.colleagues.add(colleague);
    }

    List<Colleague<T>> getColleagues() {
        return this.colleagues;
    }

    abstract void mediate(final T data);
}
