package com.jaeyeonling.designpattern.singleton.speaker;

public class Speaker {

    static final int DEFAULT_VOLUME = 10;

    private static final Speaker INSTANCE = new Speaker(DEFAULT_VOLUME);

    private int volume;

    private Speaker(final int volume) {
        this.volume = volume;
    }

    public void up() {
        volume++;
    }

    public void down() {
        volume--;
    }

    public static Speaker getInstance() {
        return INSTANCE;
    }

    @Override
    public String toString() {
        return "Speaker{" +
                "volume=" + volume +
                '}';
    }
}
