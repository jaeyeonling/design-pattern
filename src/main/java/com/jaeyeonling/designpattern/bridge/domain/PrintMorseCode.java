package com.jaeyeonling.designpattern.bridge.domain;

public class PrintMorseCode extends MorseCode {

    public PrintMorseCode(final MorseCodeFunction morseCodeFunction) {
        super(morseCodeFunction);
    }

    public PrintMorseCode g() {
        dash();
        dash();
        dot();
        space();

        return this;
    }

    public PrintMorseCode a() {
        dot();
        dash();
        space();

        return this;
    }

    public PrintMorseCode r() {
        dot();
        dash();
        dot();
        space();

        return this;
    }

    public PrintMorseCode m() {
        dash();
        dash();
        space();

        return this;
    }
}
