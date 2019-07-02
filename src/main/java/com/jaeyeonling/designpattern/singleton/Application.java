package com.jaeyeonling.designpattern.singleton;

import com.jaeyeonling.designpattern.singleton.speaker.Speaker;

public class Application {

    public static void main(final String... args) {
        final Speaker speaker1 = Speaker.getInstance();
        final Speaker speaker2 = Speaker.getInstance();

        System.out.println(speaker2);

        speaker1.down();

        System.out.println(speaker2);
    }
}
