package com.mmelo.designpatterns;

import com.mmelo.designpatterns.creation.singleton.Singleton;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class SingletonTests {


    @Test
    void singleton() {
        final Singleton singleton = Singleton.getInstance("FOO");
        final Singleton anotherSingleton = Singleton.getInstance("BAR");
        System.out.println(singleton.value);
        System.out.println(anotherSingleton.value);
    }
}
