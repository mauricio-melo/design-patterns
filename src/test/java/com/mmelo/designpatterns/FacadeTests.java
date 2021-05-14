package com.mmelo.designpatterns;

import com.mmelo.designpatterns.structural.facade.ShapeFacade;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class FacadeTests {


    @Test
    void facade() {
        ShapeFacade shapeFacade = new ShapeFacade();
        shapeFacade.drawCircle();
        shapeFacade.drawRectangle();
        shapeFacade.drawSquare();

        System.out.println("\n\nDraw everything");
        shapeFacade.drawEverything();
    }
}
