package com.mmelo.designpatterns.behavioral.command.commands;

public class Logger implements Command {
    public final String message;

    public Logger(String message) {
        this.message = message;
    }

    @Override
    public void run() {
        System.out.println(message);
    }
}