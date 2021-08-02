package com.mmelo.designpatterns.behavioral.strategy.processor.impl;


import java.math.BigDecimal;

import com.mmelo.designpatterns.behavioral.strategy.processor.TypeOperation;
import org.springframework.stereotype.Component;

@Component(SubtractionProcessor.SUB)
public class SubtractionProcessor implements TypeOperation {

    public static final String SUB = "SUB";

    @Override
    public BigDecimal execute(final BigDecimal number1, final BigDecimal number2) {
        return number1.subtract(number2);
    }
}
