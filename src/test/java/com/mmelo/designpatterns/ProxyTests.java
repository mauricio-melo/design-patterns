package com.mmelo.designpatterns;

import com.mmelo.designpatterns.structural.proxy.Image;
import com.mmelo.designpatterns.structural.proxy.ProxyImage;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class ProxyTests {


    @Test
    void proxy() {
        Image image = new ProxyImage("test_10mb.jpg");

        //image will be loaded from disk
        image.display();
        System.out.println("");

        //image will not be loaded from disk
        image.display();
    }
}
