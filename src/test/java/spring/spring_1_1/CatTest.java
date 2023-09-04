package spring.spring_1_1;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CatTest {
    Cat cat;

    @BeforeEach
    public void createCat() {
        cat = new Cat();
    }

    @Test
    void setName() {
        cat.setName("Tosha");
        assertEquals("Tosha", cat.getName());
    }
}