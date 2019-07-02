package com.jaeyeonling.designpattern.visitor.domain;

@FunctionalInterface
public interface Visitable {

    void accept(final Visitor visitor);
}
