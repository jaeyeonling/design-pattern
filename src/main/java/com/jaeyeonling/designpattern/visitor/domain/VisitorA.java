package com.jaeyeonling.designpattern.visitor.domain;

public class VisitorA implements Visitor {

    private int age;

    @Override
    public void visit(final Visitable visitable) {
        if (visitable instanceof VisitableA) {
            age += ((VisitableA) visitable).getAge();
        }
    }

    @Override
    public String toString() {
        return "VisitorA{" +
                "age=" + age +
                '}';
    }
}
