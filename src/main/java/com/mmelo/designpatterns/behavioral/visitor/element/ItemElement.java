package com.mmelo.designpatterns.behavioral.visitor.element;

import com.mmelo.designpatterns.behavioral.visitor.visitor.ShoppingCartVisitor;

public interface ItemElement {

    int accept(ShoppingCartVisitor visitor);
}