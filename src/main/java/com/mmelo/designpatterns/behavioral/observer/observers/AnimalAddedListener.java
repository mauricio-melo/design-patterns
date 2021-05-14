package com.mmelo.designpatterns.behavioral.observer.observers;

import com.mmelo.designpatterns.behavioral.observer.subject.Animal;

public interface AnimalAddedListener {
    void onAnimalAdded(Animal animal);
}