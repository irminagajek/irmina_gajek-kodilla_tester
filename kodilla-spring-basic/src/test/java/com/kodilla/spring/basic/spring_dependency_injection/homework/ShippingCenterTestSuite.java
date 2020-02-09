package com.kodilla.spring.basic.spring_dependency_injection.homework;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootTest
public class ShippingCenterTestSuite {

    @Test
    public void packageShouldNotBeDeliveredIfWeightIsAbove30() {
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring.basic");
        ShippingCenter bean = context.getBean(ShippingCenter.class);
        String result = bean.sendPackage("Warsaw", 34.5);
        Assertions.assertEquals("Package not delivered to: Warsaw", result);
    }

    @Test
    public void packageShouldBeDeliveredIfWeightIsUnder30() {
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring.basic");
        ShippingCenter bean = context.getBean(ShippingCenter.class);
        String result = bean.sendPackage("Cracow", 24.5);
        Assertions.assertEquals("Package delivered to: Cracow", result);
    }

    @Test
    public void shouldReturnCorrectMessage() {
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring.basic");
        ShippingCenter bean = context.getBean(ShippingCenter.class);
        String message = bean.sendPackage("address", 1.0);
        Assertions.assertNotNull(message);
    }
}