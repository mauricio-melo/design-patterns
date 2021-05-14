package com.mmelo.designpatterns.behavioral.visitor.visitor;


import com.mmelo.designpatterns.behavioral.visitor.element.Book;
import com.mmelo.designpatterns.behavioral.visitor.element.Drink;
import com.mmelo.designpatterns.behavioral.visitor.element.Fruit;

public class ShoppingCartVisitorImpl implements ShoppingCartVisitor {

    @Override
    public int visit(Book book) {
        int cost = 0;
        //apply 5$ discount if book price is greater than 50
        if (book.getPrice() > 50) {
            cost = book.getPrice() - 5;
        } else cost = book.getPrice();
        System.out.println("Book " + book.getName() + " cost = " + cost);
        return cost;
    }

    @Override
    public int visit(Fruit fruit) {
        int cost = fruit.getPricePerKg() * fruit.getWeight();
        System.out.println(fruit.getName() + " cost = " + cost);
        return cost;
    }

    @Override
    public int visit(Drink drink) {
        System.out.println(drink.getName() + " cost = " + drink.getPrice());
        return drink.getPrice();
    }

}