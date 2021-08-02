package com.mmelo.designpatterns.behavioral.strategy.processor.impl;


import java.math.BigDecimal;
import java.math.RoundingMode;

import com.mmelo.designpatterns.behavioral.strategy.processor.TypeOperation;
import org.springframework.stereotype.Component;

@Component(DivisionProcessor.DIV)
public class DivisionProcessor implements TypeOperation {

    public static final String DIV = "DIV";

    @Override
    public BigDecimal execute(final BigDecimal number1, final BigDecimal number2) {
        return number1.divide(number2, 2, RoundingMode.UP);
    }
}
