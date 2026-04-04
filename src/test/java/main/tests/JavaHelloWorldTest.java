package main.tests;

import main.app.JavaHelloWorld;
import org.testng.annotations.Test;

@Test
public class JavaHelloWorldTest {

    public void testGetHelloWorld() {
        JavaHelloWorld javaHelloWorld = new JavaHelloWorld();
        String result = javaHelloWorld.getHelloWorld();
        assert result.equals("Hello, World!") : "Expected 'Hello, World!' but got '" + result + "'";
    }
}
