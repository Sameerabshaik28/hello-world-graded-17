package org.launchcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HelloWorldTest {
    @Test
    public void testSayHello() {
        assertEquals("Hello1, World!", HelloWorld.sayHello());
    }
}