package com.jaeyeonling.designpattern.visitor.domain;

public class VisitableA implements Visitable {

    private int age;

    public VisitableA(int age) {
        this.age = age;
    }

    public VisitableA() {
    }

    @Override
    public void accept(final Visitor visitor) {
        visitor.visit(this);
    }

    int getAge() {
        return age;
    }
}
