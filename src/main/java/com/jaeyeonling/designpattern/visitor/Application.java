package com.jaeyeonling.designpattern.visitor;

import com.jaeyeonling.designpattern.visitor.domain.Visitable;
import com.jaeyeonling.designpattern.visitor.domain.VisitableA;
import com.jaeyeonling.designpattern.visitor.domain.Visitor;
import com.jaeyeonling.designpattern.visitor.domain.VisitorA;

import java.util.List;

public class Application {

    public static void main(final String... args) {
        final List<Visitable> visitables = List.of(new VisitableA(1),
                new VisitableA(2), new VisitableA(3), new VisitableA(4), new VisitableA(5));

        final Visitor visitor = new VisitorA();
        visitables.forEach(visitor::visit);

        System.out.println(visitor);
    }
}
