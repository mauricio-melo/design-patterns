package com.mmelo.designpatterns.behavioral.strategy.processor.impl;


import static com.mmelo.designpatterns.behavioral.strategy.constants.Operation.DIV;

import java.math.BigDecimal;
import java.math.RoundingMode;

import com.mmelo.designpatterns.behavioral.strategy.processor.TypeOperation;
import org.springframework.stereotype.Component;

@Component(DIV)
public class DivisionProcessor implements TypeOperation {

    @Override
    public BigDecimal execute(final BigDecimal number1, final BigDecimal number2) {
        return number1.divide(number2, 2, RoundingMode.UP);
    }
}
