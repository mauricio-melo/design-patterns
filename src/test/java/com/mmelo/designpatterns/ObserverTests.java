package com.mmelo.designpatterns;

import com.mmelo.designpatterns.behavioral.observer.subject.Animal;
import com.mmelo.designpatterns.behavioral.observer.observers.PrintNameAnimalAddedListener;
import com.mmelo.designpatterns.behavioral.observer.subject.Zoo;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class ObserverTests {

    @Autowired
    private Zoo zoo;

    @Test
    void zoo() {
        zoo.addAnimal(new Animal("Tiger"));
    }
}
