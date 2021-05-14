package com.mmelo.designpatterns.behavioral.interpreter.operations;

import com.mmelo.designpatterns.behavioral.interpreter.operations.Operation;

public class Division implements Operation {

    private final Operation left;
    private final Operation right;

    public Division(final Operation esquerda, final Operation right) {
        this.left = esquerda;
        this.right = right;
    }

    @Override
    public int interpret() {
        return this.left.interpret() / this.right.interpret();
    }
}