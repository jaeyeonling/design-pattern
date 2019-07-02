package com.jaeyeonling.designpattern.observer.basic;

import com.jaeyeonling.designpattern.observer.basic.domain.Button;
import com.jaeyeonling.designpattern.observer.basic.domain.ButtonListner;

public class Application {

    public static void main(final String... args) {
        final Button button = new Button();

        button.addObserver(new ButtonListner());
        button.addObserver(new ButtonListner());
        button.addObserver(new ButtonListner());

        button.onClick();
    }
}
