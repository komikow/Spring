package spring.spring_1_1;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class AppConfigTest {
    Cat cat;

    @BeforeEach
    void createCat() {
        cat = new Cat();
    }

    @Test
    void getCatName() {
        cat.setName("Barsik");
        assertEquals("Barsik", cat.getName());
    }
}