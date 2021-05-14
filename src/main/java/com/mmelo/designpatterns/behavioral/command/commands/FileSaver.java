package com.mmelo.designpatterns.behavioral.command.commands;

public class FileSaver implements Command {
    public final String message;

    public FileSaver(String message) {
        this.message = message;
    }

    @Override
    public void run() {
        System.out.println(message);
    }
}