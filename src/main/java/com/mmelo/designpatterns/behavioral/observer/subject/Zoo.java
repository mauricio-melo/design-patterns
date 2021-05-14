package com.mmelo.designpatterns.behavioral.observer.subject;

import java.util.ArrayList;
import java.util.List;

import com.mmelo.designpatterns.behavioral.observer.observers.AnimalAddedListener;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service
public class Zoo {

    private List<Animal> animals = new ArrayList<>();

    @Autowired
    private List<AnimalAddedListener> listeners;

    public void addAnimal(Animal animal) {
        this.animals.add(animal);
        this.notifyAnimalAddedListeners(animal);
    }

    protected void notifyAnimalAddedListeners(Animal animal) {
        this.listeners.forEach(listener -> listener.onAnimalAdded(animal));
    }
}