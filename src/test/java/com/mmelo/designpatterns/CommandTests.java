package com.mmelo.designpatterns;

import java.util.ArrayList;
import java.util.List;

import com.mmelo.designpatterns.behavioral.command.commands.Command;
import com.mmelo.designpatterns.behavioral.command.commands.FileSaver;
import com.mmelo.designpatterns.behavioral.command.commands.Logger;
import com.mmelo.designpatterns.behavioral.command.commands.Mailer;
import com.mmelo.designpatterns.behavioral.command.executor.Executor;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class CommandTests {

    @Test
    void command() {
        List<Command> tasks = new ArrayList<>();
        tasks.add(new Logger("Hi"));
        tasks.add(new FileSaver("Excel"));
        tasks.add(new Mailer("Bye"));

        new Executor().execute(tasks);
    }

    @Test
    void commandWithFunctionalInterface() {
        final List<Runnable> tasks = new ArrayList<>();
        tasks.add(() -> hi("Messi"));
        tasks.add(() -> hello("Cristiano Ronaldo"));
        tasks.add(() -> hey("Neymar"));
        tasks.forEach( Runnable::run );
    }

    public void hi(String message) {
        System.out.println("Hi, " + message);
    }

    public void hello(String message) {
        System.out.println("Hello, " + message);
    }

    public void hey(String message) {
        System.out.println("Hey, " + message);
    }
}
