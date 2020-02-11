package com.kodilla.spring.basic.spring_configuration.homework;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.time.LocalTime;

@SpringBootTest
public class CarApplicationTestSuite {

    @Test
    public void shouldReturnCarTypeAccordingToSeason() {
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring.basic.spring_configuration.homework");
        Car car = (Car) context.getBean("chooseCar");
        String type = car.getCarType("zima");
        Assertions.assertEquals("SUV", type);
    }

    @Test
    public void shouldTurnLightsOffBetween6And20() {
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring.basic.spring_configuration.homework");
        SUV suv = (SUV) context.getBean(SUV.class);
        Boolean result = suv.hasHeadlightsTurnedOn(LocalTime.of(16, 34));
        Assertions.assertEquals(false, result);
    }

    @Test
    public void shouldTurnLightsOnBetween20And6() {
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring.basic.spring_configuration.homework");
        SUV suv = (SUV) context.getBean(SUV.class);
        Boolean result = suv.hasHeadlightsTurnedOn(LocalTime.of(3, 15));
        Assertions.assertEquals(true, result);
    }
}