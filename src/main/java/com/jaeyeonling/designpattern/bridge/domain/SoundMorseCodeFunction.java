package com.jaeyeonling.designpattern.bridge.domain;

public class SoundMorseCodeFunction implements MorseCodeFunction {

    @Override
    public void dot() {
        System.out.print("삣");

    }

    @Override
    public void dash() {
        System.out.print("삐~");
    }

    @Override
    public void space() {
        System.out.print(" ");
    }
}
