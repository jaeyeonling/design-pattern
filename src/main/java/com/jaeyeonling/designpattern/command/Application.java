package com.jaeyeonling.designpattern.command;

import com.jaeyeonling.designpattern.command.domain.Command;
import com.jaeyeonling.designpattern.command.domain.PrintCommand;

import java.util.ArrayList;
import java.util.List;

public class Application {

    public static void main(final String... args) {
        final List<Command> commands = new ArrayList<>();

        commands.add(new PrintCommand("작업 1"));
        commands.add(new PrintCommand("작업 2"));
        commands.add(new PrintCommand("작업 3"));

        commands.forEach(Command::execute);
    }
}
