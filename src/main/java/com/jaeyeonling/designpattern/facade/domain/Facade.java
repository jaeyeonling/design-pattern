package com.jaeyeonling.designpattern.facade.domain;

public class Facade {

    private final HelpSystem01 helpSystem01;
    private final HelpSystem02 helpSystem02;
    private final HelpSystem03 helpSystem03;
    private final HelpSystem04 helpSystem04;

    public Facade() {
        helpSystem01 = new HelpSystem01();
        helpSystem02 = new HelpSystem02();
        helpSystem03 = new HelpSystem03();
        helpSystem04 = new HelpSystem04();
    }

    public void process() {
        helpSystem01.process();
        helpSystem02.process();
        helpSystem03.process();
        helpSystem04.process();
    }
}
