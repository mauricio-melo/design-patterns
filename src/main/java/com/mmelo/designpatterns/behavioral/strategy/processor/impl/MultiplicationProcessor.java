package com.mmelo.designpatterns.behavioral.strategy.processor.impl;


import java.math.BigDecimal;

import com.mmelo.designpatterns.behavioral.strategy.processor.TypeOperation;
import org.springframework.stereotype.Component;

@Component(MultiplicationProcessor.MUL)
public class MultiplicationProcessor implements TypeOperation {

    public static final String MUL = "MUL";

    @Override
    public BigDecimal execute(final BigDecimal number1, final BigDecimal number2) {
        return number1.multiply(number2);
    }
}
