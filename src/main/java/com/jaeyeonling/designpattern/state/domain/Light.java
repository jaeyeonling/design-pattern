package com.jaeyeonling.designpattern.state.domain;

public class Light implements LightState {


    private final LightState offState = new LightState() {
        @Override
        public void on() {
            lightState = onState;
            System.out.println("불이 켜진다.");
        }

        @Override
        public void off() {
            System.out.println("아무 일도 없다.");
        }
    };

    private final LightState onState = new LightState() {

        @Override
        public void on() {
            System.out.println("불이 켜진다.");
        }

        @Override
        public void off() {
            lightState = offState;
            System.out.println("불이 꺼진다.");
        }
    };

    private LightState lightState = offState;

    @Override
    public void on() {
        lightState.on();
    }

    @Override
    public void off() {
        lightState.off();
    }
}
