package com.mmelo.designpatterns.behavioral.strategy.processor.impl;


import java.math.BigDecimal;

import com.mmelo.designpatterns.behavioral.strategy.processor.TypeOperation;
import org.springframework.stereotype.Component;


@Component(SumProcessor.SUM)
public class SumProcessor implements TypeOperation {

    public static final String SUM = "SUM";

    @Override
    public BigDecimal execute(final BigDecimal number1, final BigDecimal number2) {
        return number1.add(number2);
    }
}
