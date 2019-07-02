package com.jaeyeonling.designpattern.bridge.domain;

public class MorseCode {

    private final MorseCodeFunction morseCodeFunction;

    public MorseCode(final MorseCodeFunction morseCodeFunction) {
        this.morseCodeFunction = morseCodeFunction;
    }

    public void dot() {
        morseCodeFunction.dot();
    }

    public void dash() {
        morseCodeFunction.dash();
    }

    public void space() {
        morseCodeFunction.space();
    }
}
