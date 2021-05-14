package com.mmelo.designpatterns;

import com.mmelo.designpatterns.behavioral.visitor.element.Book;
import com.mmelo.designpatterns.behavioral.visitor.element.Drink;
import com.mmelo.designpatterns.behavioral.visitor.element.Fruit;
import com.mmelo.designpatterns.behavioral.visitor.element.ItemElement;
import com.mmelo.designpatterns.behavioral.visitor.visitor.ShoppingCartVisitor;
import com.mmelo.designpatterns.behavioral.visitor.visitor.ShoppingCartVisitorImpl;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class VisitorTests {


    @Test
    void visitor() {
        ItemElement[] items = new ItemElement[]{new Book("Life is good", 55),
                new Fruit(10, 2, "Banana"), new Fruit(5, 5, "Apple"), new Drink("coca-cola", 3)};

        int total = calculatePrice(items);
        System.out.println("Total Cost = " + total);
    }


    private int calculatePrice(ItemElement[] items) {
        final ShoppingCartVisitor visitor = new ShoppingCartVisitorImpl();
        int sum = 0;
        for (ItemElement item : items) {
            sum = sum + item.accept(visitor);
        }
        return sum;
    }
}
