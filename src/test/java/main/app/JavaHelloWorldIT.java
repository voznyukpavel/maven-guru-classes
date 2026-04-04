package main.app;

import org.junit.jupiter.api.Test;

public class JavaHelloWorldIT {
    @Test
    public void testGetHelloWorld() {
        JavaHelloWorld javaHelloWorld = new JavaHelloWorld();
        String result = javaHelloWorld.getHelloWorld();
        assert result.equals("Hello, World!") : "Expected 'Hello, World!' but got '" + result + "'";
    }
}
