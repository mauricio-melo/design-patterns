package com.mmelo.designpatterns.behavioral.strategy.processor.impl;


import static com.mmelo.designpatterns.behavioral.strategy.constants.Operation.SUM;

import java.math.BigDecimal;

import com.mmelo.designpatterns.behavioral.strategy.processor.TypeOperation;
import org.springframework.stereotype.Component;


@Component(SUM)
public class SumProcessor implements TypeOperation {

    @Override
    public BigDecimal execute(final BigDecimal number1, final BigDecimal number2) {
        return number1.add(number2);
    }
}
