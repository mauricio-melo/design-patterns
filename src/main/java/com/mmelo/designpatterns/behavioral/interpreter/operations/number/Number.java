package com.mmelo.designpatterns.behavioral.interpreter.operations.number;

import com.mmelo.designpatterns.behavioral.interpreter.operations.Operation;

public class Number implements Operation {

    private final int number;

    public Number(final int number) {
        this.number = number;
    }

    @Override
    public int interpret() {
        return this.number;
    }
}