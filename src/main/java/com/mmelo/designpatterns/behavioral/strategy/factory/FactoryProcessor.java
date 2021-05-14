package com.mmelo.designpatterns.behavioral.strategy.factory;


import com.mmelo.designpatterns.behavioral.strategy.processor.TypeOperation;

public interface FactoryProcessor {
    TypeOperation getOperation(final String text);
}
