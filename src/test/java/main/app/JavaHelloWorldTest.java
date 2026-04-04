package main.app;

import static org.junit.Assert.*;

public class JavaHelloWorldTest {

    @org.junit.Test
    public void testGetHello() {
        JavaHelloWorld javaHelloWorld = new JavaHelloWorld();
        String result = javaHelloWorld.getHello();
        assertEquals("Hello, World!", result);
    }

}