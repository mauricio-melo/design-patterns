package com.mmelo.designpatterns.behavioral.strategy.constants;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class Operation {
    public static final String SUM = "SUM";
    public static final String SUB = "SUB";
    public static final String DIV = "DIV";
    public static final String MUL = "MUL";
}
