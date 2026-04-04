package main.app;

import org.junit.jupiter.api.Test;

public class JUnit5Test {
    @Test
    public void testHelloWorld() {
        JavaHelloWorld helloWorld = new JavaHelloWorld();
        String result = helloWorld.getHello();
        assert result.equals("Hello, World!") : "Expected 'Hello, World!' but got '" + result + "'";
    }
}
