package main.app;

import static org.junit.Assert.*;

public class JavaHelloWorldJunit4Test {

    @org.junit.Test
    public void testGetHelloWorld4Test() {
        JavaHelloWorld javaHelloWorld = new JavaHelloWorld();
        String result = javaHelloWorld.getHelloWorld();
        assertEquals("Hello, World!", result);
    }

}