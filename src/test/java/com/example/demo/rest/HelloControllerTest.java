package com.example.demo.rest;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;


@ExtendWith(MockitoExtension.class)
class HelloControllerTest {

    private HelloController helloController;

    @BeforeEach
    public void setup() {
        helloController = new HelloController();
    }

    @Test
    void sayHelloTest() {
        var name = "Luis";
        Assertions.assertEquals("Hello Luis!", helloController.sayHello(name));
    }
}
