package com.jaeyeonling.designpattern.memento;

import com.jaeyeonling.designpattern.memento.domain.Memento;
import com.jaeyeonling.designpattern.memento.domain.Originator;

import java.util.Stack;

public class Application {

    public static void main(final String... args) {
        final Stack<Memento<String>> mementos = new Stack<>();

        final Originator<String> originator = new Originator<>("State 1");
        mementos.push(originator.createMemento());

        originator.setState("State 2");
        mementos.push(originator.createMemento());

        originator.setState("State 3");
        mementos.push(originator.createMemento());

        originator.setState("State Final");
        mementos.push(originator.createMemento());

        System.out.println(originator);

        originator.restoreMemento(mementos.pop());
        System.out.println(originator);

        originator.restoreMemento(mementos.pop());
        System.out.println(originator);

        originator.restoreMemento(mementos.pop());
        System.out.println(originator);

        originator.restoreMemento(mementos.pop());
        System.out.println(originator);
    }
}
