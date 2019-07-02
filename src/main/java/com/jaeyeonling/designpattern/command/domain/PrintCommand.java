package com.jaeyeonling.designpattern.command.domain;

public class PrintCommand implements Command {

    private final String printMessage;

    public PrintCommand(final String printMessage) {
        this.printMessage = printMessage;
    }

    @Override
    public void execute() {
        System.out.println(printMessage);
    }
}
