package com.mmelo.designpatterns.structural.decorator.decorator;

import com.mmelo.designpatterns.structural.decorator.Car;

public class SportsCar extends CarDecorator {

    public SportsCar(Car c) {
        super(c);
    }

    @Override
    public void assemble() {
        super.assemble();
        System.out.print(" Adding features of Sports Car.");
    }
}