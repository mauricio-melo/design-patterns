package com.mmelo.designpatterns.behavioral.strategy.service;

import java.math.BigDecimal;

import com.mmelo.designpatterns.behavioral.strategy.factory.FactoryProcessor;
import com.mmelo.designpatterns.behavioral.strategy.processor.TypeOperation;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class StrategyService {

    private final FactoryProcessor factoryProcessor;

    public BigDecimal getResult(final BigDecimal number1, final BigDecimal number2, final String operation) {
        final TypeOperation typeOperation = factoryProcessor.getOperation(operation);
        return typeOperation.execute(number1, number2);
    }
}
