package com.mmelo.designpatterns.creation.factorymethod.factory;

import com.mmelo.designpatterns.creation.factorymethod.drink.Drink;
import com.mmelo.designpatterns.creation.factorymethod.drink.Soda;

public class SodaMachine extends DrinkMachine {

    @Override
    public Drink delivery() {
        return new Soda();
    }
}