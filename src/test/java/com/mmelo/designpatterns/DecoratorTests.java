package com.mmelo.designpatterns;

import com.mmelo.designpatterns.structural.decorator.BasicCar;
import com.mmelo.designpatterns.structural.decorator.Car;
import com.mmelo.designpatterns.structural.decorator.decorator.LuxuryCar;
import com.mmelo.designpatterns.structural.decorator.decorator.SportsCar;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class DecoratorTests {


    @Test
    void visitor() {
        final Car sportsCar = new SportsCar(new BasicCar());
        sportsCar.assemble();
        System.out.println("\n*****");

        final Car sportsLuxuryCar = new SportsCar(new LuxuryCar(new BasicCar()));
        sportsLuxuryCar.assemble();
    }
}
