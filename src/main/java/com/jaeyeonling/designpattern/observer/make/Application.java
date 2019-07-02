package com.jaeyeonling.designpattern.observer.make;

import com.jaeyeonling.designpattern.observer.make.domain.Button;
import com.jaeyeonling.designpattern.observer.make.domain.ButtonClickListner;

public class Application {

    public static void main(final String... args) {
        final Button button = new Button(new ButtonClickListner());

        button.click();
        button.click();
        button.click();

        final Button newButton = new Button(b -> System.out.println("@@@" + b + "@@@"));

        newButton.click();
        newButton.click();
        newButton.click();
    }
}
