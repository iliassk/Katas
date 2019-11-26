import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class E01Test {

    @Test
    void shouldPrintHelloWorld() {
        E01 instance = new E01();
        assertTrue(instance.sayHello() == "Hello World!");
    }
}