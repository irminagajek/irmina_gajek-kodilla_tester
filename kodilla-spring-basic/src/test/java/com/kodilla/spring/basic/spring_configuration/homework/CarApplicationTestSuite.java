package com.kodilla.spring.basic.spring_configuration.homework;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootTest
public class CarApplicationTestSuite {

//    @Test
//    public void test1() {
//        //Given
//        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring.basic");
//        Car car = (Car) context.getBean("chooseCar"); //wyszukujemy beana po nazwie chooseCar, wynik rzutujemy na Car
//        //When
//        String type = car.getCarType("zima"); //wywolujemy metodę
//        //Then
//        Assertions.assertEquals("SUV", type);
//    }

    @Test
    public void test() {
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring");
        Car car = (Car) context.getBean("chooseCar");
        String type = car.getCarType("zima");
        Assertions.assertEquals("SUV", type);
    }
}