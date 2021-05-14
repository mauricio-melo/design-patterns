package com.mmelo.designpatterns.behavioral.command.executor;

import java.util.List;

import com.mmelo.designpatterns.behavioral.command.commands.Command;

public class Executor {
    public void execute(final List<Command> tasks) {
        for (Command task : tasks) {
            task.run();
        }
    }
}