package main.tests;

import main.app.JavaHelloWorld;

public class JavaHelloWorldTest {

    public void testGetHelloWorld() {
        JavaHelloWorld javaHelloWorld = new JavaHelloWorld();
        String result = javaHelloWorld.getHelloWorld();
        assert ("Hello, World!".equals(result)) : "Expected 'Hello, World!' but got '" + result + "'";
    }
}
