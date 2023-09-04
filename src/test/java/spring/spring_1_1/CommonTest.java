package spring.spring_1_1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CommonTest {
    @Test
    void availableCatTest() {
        Assertions.assertNotEquals("cat1", "cat2");
    }
}
