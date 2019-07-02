package com.jaeyeonling.designpattern.mediator.domain;

public class ChatMediator extends Mediator<String> {

    @Override
    void mediate(final String data) {
        getColleagues().forEach(colleague -> colleague.handle(data));
    }
}
