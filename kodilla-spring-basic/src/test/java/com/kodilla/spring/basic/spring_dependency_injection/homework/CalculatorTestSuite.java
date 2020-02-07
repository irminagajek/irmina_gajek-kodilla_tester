package com.kodilla.spring.basic.spring_dependency_injection.homework;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootTest
public class CalculatorTestSuite {

    @Test
    public void shouldDisplayAddResult() {
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring.basic");
        Display bean = context.getBean(Display.class);
        double value = bean.display(6 + 2);
        Assertions.assertNotNull(value);
    }

    @Test
    public void shouldDisplaySubtractResult() {
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring.basic");
        Display bean = context.getBean(Display.class);
        double value = bean.display(6 - 2);
        Assertions.assertNotNull(value);
    }

    @Test
    public void shouldDisplayMultiplyResult() {
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring.basic");
        Display bean = context.getBean(Display.class);
        double value = bean.display(6 * 2);
        Assertions.assertNotNull(value);
    }

    @Test
    public void shouldDisplayDivideResult() {
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring.basic");
        Display bean = context.getBean(Display.class);
        double value = bean.display(6 / 2);
        Assertions.assertNotNull(value);
    }
}