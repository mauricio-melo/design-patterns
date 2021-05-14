package com.mmelo.designpatterns.behavioral.visitor.visitor;

import com.mmelo.designpatterns.behavioral.visitor.element.Book;
import com.mmelo.designpatterns.behavioral.visitor.element.Drink;
import com.mmelo.designpatterns.behavioral.visitor.element.Fruit;

public interface ShoppingCartVisitor {
    int visit(Book book);

    int visit(Fruit fruit);

    int visit(Drink drink);
}