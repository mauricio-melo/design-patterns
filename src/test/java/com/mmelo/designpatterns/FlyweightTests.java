package com.mmelo.designpatterns;

import com.mmelo.designpatterns.structural.flyweight.Circle;
import com.mmelo.designpatterns.structural.flyweight.ShapeFactory;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class FlyweightTests {

    private static final String[] colors = {"Red", "Green", "Blue", "White", "Black"};

    @Test
    void flyweight() {
        for (int i = 0; i < 20; ++i) {
            Circle circle = (Circle) ShapeFactory.getCircle(getRandomColor());
            circle.setX(getRandomX());
            circle.setY(getRandomY());
            circle.setRadius(100);
            circle.draw();
        }
    }

    private static String getRandomColor() {
        return colors[(int) (Math.random() * colors.length)];
    }

    private static int getRandomX() {
        return (int) (Math.random() * 100);
    }

    private static int getRandomY() {
        return (int) (Math.random() * 100);
    }
}
