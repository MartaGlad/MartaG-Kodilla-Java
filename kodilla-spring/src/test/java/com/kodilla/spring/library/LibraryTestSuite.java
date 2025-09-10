package com.kodilla.spring.library;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Arrays;

@SpringBootTest
public class LibraryTestSuite {

    @Autowired
    private Library library;

    @Test
    void testSaveToDb() {
        //Given
        /*ApplicationContext context =
                new AnnotationConfigApplicationContext("com.kodilla.spring");
        Library library = context.getBean(Library.class);*/ //zamienimy wyciąganie beanów przez metodę getBean(),
        // dodając odpowiednie pole z adnotacją @Autowired
        //When
        library.saveToDb();
        //Then
        //do nothing
    }


    @Test
    void testLoadFromDb() {
        //Given
        /*ApplicationContext context =
                new AnnotationConfigApplicationContext("com.kodilla.spring");
        Library library = context.getBean(Library.class);*/
        //When
        library.loadFromDb();
        //Then
        //do nothing
    }

    @Test
    void testContext() {
        //Given
        ApplicationContext context =
                new AnnotationConfigApplicationContext("com.kodilla.spring"/*LibraryConfig.class*/);
        //When & Then
        System.out.println("===== Beans list: ===== >>");
        Arrays.stream(context.getBeanDefinitionNames())
                .forEach(System.out::println);
        System.out.println("<< ==== Beans list: =====");

    }
}
