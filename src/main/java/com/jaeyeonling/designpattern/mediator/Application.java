package com.jaeyeonling.designpattern.mediator;

import com.jaeyeonling.designpattern.mediator.domain.ChatColleague;
import com.jaeyeonling.designpattern.mediator.domain.ChatMediator;
import com.jaeyeonling.designpattern.mediator.domain.Colleague;
import com.jaeyeonling.designpattern.mediator.domain.Mediator;

public class Application {

    public static void main(final String... args) {
        final Mediator<String> mediator = new ChatMediator();

        final Colleague<String> colleague1 = new ChatColleague(mediator);
        final Colleague<String> colleague2 = new ChatColleague(mediator);
        final Colleague<String> colleague3 = new ChatColleague(mediator);

        colleague1.sendData("colleague1: AAA");
        colleague2.sendData("colleague2: BBB");
        colleague3.sendData("colleague3: CCC");

    }
}
