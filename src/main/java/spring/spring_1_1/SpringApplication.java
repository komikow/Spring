package spring.spring_1_1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SpringApplication {

    public static void main(String[] args) {
        ApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(AppConfig.class);
        HelloWorld bean1 =
                (HelloWorld) applicationContext.getBean("helloworld");
        System.out.println(bean1.getMessage());
        HelloWorld bean2 =
                (HelloWorld) applicationContext.getBean("helloworld");
        System.out.println(bean1.getMessage());
        Cat cat1 = (Cat) applicationContext.getBean("catname");
        System.out.println(cat1);
        Cat cat2 = (Cat) applicationContext.getBean("catname");
        System.out.println(cat2);
        System.out.println(bean1.equals(bean2));
        System.out.println();
        System.out.println(cat1.equals(cat2));
    }

}
