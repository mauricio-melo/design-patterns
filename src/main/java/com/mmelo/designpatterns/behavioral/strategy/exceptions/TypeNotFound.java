package com.mmelo.designpatterns.behavioral.strategy.exceptions;

public class TypeNotFound extends RuntimeException {

    public TypeNotFound(final String message) {
            super(message);
        }
}