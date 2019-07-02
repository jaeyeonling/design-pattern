package com.jaeyeonling.designpattern.observer.advance;

import com.jaeyeonling.designpattern.observer.advance.domain.Button;
import com.jaeyeonling.designpattern.observer.advance.domain.Observable;

public class Application {

    public static void main(final String... args) {
        final Observable<String> observable = new Observable<>();
        final Button button = new Button(observable);

        button.addObserver((o, arg) -> System.out.println(o + " | Clicked"));

        button.click();
        button.click();
        button.click();
    }
}
