package com.mmelo.designpatterns.behavioral.strategy.processor;

import java.math.BigDecimal;

public interface TypeOperation {
    BigDecimal execute(final BigDecimal number1, final BigDecimal number2);
}
