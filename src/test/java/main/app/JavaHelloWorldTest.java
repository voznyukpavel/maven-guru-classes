package main.app;

import static org.junit.jupiter.api.Assertions.*;
class JavaHelloWorldTest {
    @org.junit.jupiter.api.Test
    void testGetHelloWorld() {
        JavaHelloWorld javaHelloWorld = new JavaHelloWorld();
        String result = javaHelloWorld.getHelloWorld();
        assertEquals("Hello, World!", result);
    }
}