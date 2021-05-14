package com.mmelo.designpatterns.creation.factorymethod.factory;

import com.mmelo.designpatterns.creation.factorymethod.drink.Coffee;
import com.mmelo.designpatterns.creation.factorymethod.drink.Drink;

public class CoffeeMachine extends DrinkMachine {

    @Override
    public Drink delivery() {
        return new Coffee();
    }
}