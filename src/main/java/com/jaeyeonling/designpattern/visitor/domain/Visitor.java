package com.jaeyeonling.designpattern.visitor.domain;

@FunctionalInterface
public interface Visitor {

    void visit(final Visitable visitable);
}
