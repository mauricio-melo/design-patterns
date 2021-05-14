package com.mmelo.designpatterns.behavioral.strategy.processor.impl;


import static com.mmelo.designpatterns.behavioral.strategy.constants.Operation.MUL;

import java.math.BigDecimal;

import com.mmelo.designpatterns.behavioral.strategy.processor.TypeOperation;
import org.springframework.stereotype.Component;

@Component(MUL)
public class MultiplicationProcessor implements TypeOperation {

    @Override
    public BigDecimal execute(final BigDecimal number1, final BigDecimal number2) {
        return number1.multiply(number2);
    }
}
