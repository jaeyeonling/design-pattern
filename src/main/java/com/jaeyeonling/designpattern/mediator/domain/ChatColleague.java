package com.jaeyeonling.designpattern.mediator.domain;

public class ChatColleague extends Colleague<String> {

    public ChatColleague(final Mediator<String> mediator) {
        super(mediator);
    }

    @Override
    public void handle(final String data) {
        System.out.println("Receive: " + data);
    }
}
