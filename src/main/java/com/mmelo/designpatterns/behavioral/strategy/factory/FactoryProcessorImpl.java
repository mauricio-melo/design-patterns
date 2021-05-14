package com.mmelo.designpatterns.behavioral.strategy.factory;

import java.text.MessageFormat;

import com.mmelo.designpatterns.behavioral.strategy.exceptions.TypeNotFound;
import com.mmelo.designpatterns.behavioral.strategy.processor.TypeOperation;
import lombok.AllArgsConstructor;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;


@Component
@AllArgsConstructor
public class FactoryProcessorImpl implements FactoryProcessor {

    private final ApplicationContext context;

    public TypeOperation getOperation(final String text) {
        if(context.containsBean(text) && context.isTypeMatch(text, TypeOperation.class)) {
            return context.getBean(text, TypeOperation.class);
        }
        throw new TypeNotFound(MessageFormat.format("Type not found : {0}", text));
    }
}
