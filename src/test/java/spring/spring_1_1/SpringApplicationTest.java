package spring.spring_1_1;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertSame;

class SpringApplicationTest {
    ApplicationContext applicationContext;

    @BeforeEach
    void getApplicationContext() {
        applicationContext = new AnnotationConfigApplicationContext(AppConfig.class);
    }

    @Test
    void getBeanHelloWorld() {
        HelloWorld helloWorld = (HelloWorld) applicationContext.getBean("helloworld");
        assertSame(helloWorld, helloWorld);
    }

    @Test
    void getTwoOfBeanCat() {
        Cat cat = (Cat) applicationContext.getBean("catname");
        Cat cat2 = (Cat) applicationContext.getBean("catname");
        assertEquals(false, cat.equals(cat2));
    }

    @Test
    void getTwoOfBeanHelloWorld() {
        HelloWorld helloWorld = (HelloWorld) applicationContext.getBean("helloworld");
        HelloWorld helloWorld2 = (HelloWorld) applicationContext.getBean("helloworld");
        assertEquals(true, helloWorld.equals(helloWorld2));
    }
}