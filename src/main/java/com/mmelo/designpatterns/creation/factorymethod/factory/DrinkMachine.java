package com.mmelo.designpatterns.creation.factorymethod.factory;

import com.mmelo.designpatterns.creation.factorymethod.drink.Drink;

public abstract class DrinkMachine {

    public abstract Drink delivery();

    public void showMessage() {
        System.out.println("Welcome to drink machine");
    }
}