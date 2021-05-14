package com.mmelo.designpatterns.structural.decorator.decorator;

import com.mmelo.designpatterns.structural.decorator.Car;

public class LuxuryCar extends CarDecorator {

    public LuxuryCar(Car c) {
        super(c);
    }

    @Override
    public void assemble() {
        super.assemble();
        System.out.print(" Adding features of Luxury Car.");
    }
}