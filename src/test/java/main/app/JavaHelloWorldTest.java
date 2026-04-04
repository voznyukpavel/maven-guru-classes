package main.app;

import static org.junit.Assert.*;

public class JavaHelloWorldTest {

    @org.junit.Test
    public void testGetHelloWorld() {
        JavaHelloWorld javaHelloWorld = new JavaHelloWorld();
        String result = javaHelloWorld.getHelloWorld();
        assertEquals("Hello, World!", result);
    }

}