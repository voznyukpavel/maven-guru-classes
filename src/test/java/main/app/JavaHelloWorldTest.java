package main.app;

class JavaHelloWorldTest {
    @org.junit.jupiter.api.Test
    void getHelloWorld() {
          System.out.println("#########################");
          System.out.println(System.getenv("TEST_HOST"));
          System.out.println("#########################");
    }
}