package com.mmelo.designpatterns.structural.facade;

public class Circle implements Shape {

    @Override
    public void draw() {
        System.out.println("Circle::draw()");
    }
}