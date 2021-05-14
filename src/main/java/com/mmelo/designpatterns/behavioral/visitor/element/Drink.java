package com.mmelo.designpatterns.behavioral.visitor.element;

import com.mmelo.designpatterns.behavioral.visitor.visitor.ShoppingCartVisitor;

public class Drink implements ItemElement {
    private String name;
    private int price;

    public Drink(String name, int price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    @Override
    public int accept(ShoppingCartVisitor visitor) {
        return visitor.visit(this);
    }
}
