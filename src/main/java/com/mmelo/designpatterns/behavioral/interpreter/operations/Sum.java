package com.mmelo.designpatterns.behavioral.interpreter.operations;

public class Sum implements Operation {

    private final Operation left;
    private final Operation right;

    public Sum(final Operation esquerda, final Operation right) {
        this.left = esquerda;
        this.right = right;
    }

    @Override
    public int interpret() {
        return this.left.interpret() + this.right.interpret();
    }
}