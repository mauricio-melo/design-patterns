package com.mmelo.designpatterns.behavioral.observer.observers;

import com.mmelo.designpatterns.behavioral.observer.subject.Animal;
import org.springframework.stereotype.Component;

@Component
public class PrintNameAnimalAddedListener implements AnimalAddedListener {

    @Override
    public void onAnimalAdded(Animal animal) {
        System.out.println("Listener: '" + this.getClass().getSimpleName() + "'");
        System.out.println("Added a new animal with name '" + animal.getName() + "'");
    }
}