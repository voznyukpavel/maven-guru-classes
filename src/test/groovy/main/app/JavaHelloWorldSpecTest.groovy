package main.app
import spock.lang.Specification

class JavaHelloWorldSpecTest extends Specification {

    def "should return Hello World"() {
        given:
        JavaHelloWorld javaHelloWorld = new JavaHelloWorld()

        when:
        String result = javaHelloWorld.getHello()

        then:
        result == "Hello, World!"
    }
}
