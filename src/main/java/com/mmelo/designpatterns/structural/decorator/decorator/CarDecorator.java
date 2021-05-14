package com.mmelo.designpatterns.structural.decorator.decorator;

import com.mmelo.designpatterns.structural.decorator.Car;

public class CarDecorator implements Car {

    protected Car car;

    public CarDecorator(Car c) {
        this.car = c;
    }

    @Override
    public void assemble() {
        this.car.assemble();
    }

}