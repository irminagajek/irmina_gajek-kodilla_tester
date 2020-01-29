package com.kodilla.execution_model.homework;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.util.Collections;
import java.util.List;

import static org.junit.Assert.*;
import static org.junit.jupiter.api.Assertions.assertFalse;

class ShopTestSuite {

    Shop shop = new Shop();

    @Test
    public void shouldReturnFalseWhenValueIsEmpty() {
        //when
        boolean result = shop.addOrder(new Order(0, LocalDate.of(2020, 1, 12), "Donald"));
        //then
        assertFalse(result);
    }

    @Test
    public void shouldReturnFalseWhenDateIsEmpty() {
        //When
        boolean result = shop.addOrder(new Order(230.45, null, "Manuel"));
        //Then
        assertFalse(result);
    }

    @Test
    public void shouldReturnFalseWhenLoginIsEmpty() {
        //When
        boolean result = shop.addOrder(new Order(230.45, LocalDate.of(2019, 9, 20),null));
        //Then
        assertFalse(result);
    }

    @Test
    public void shouldAddOrdersToShop() {
        //When
        int numberOfOrders = shop.getSize();
        //Then
        assertNotEquals(0, numberOfOrders);
    }

@Test
    public void shouldReturnOrdersBetweenDates() throws OrderNotFoundException {
    List<Order> orders = shop.returnOrdersBasedOnDates(LocalDate.of(2019, 11, 30),
            LocalDate.of(2020, 1, 12));
    assertNotEquals(0, orders.size());
    for (Order ordersByDate :orders){
        assertTrue(ordersByDate.dateOfIssue.isAfter(LocalDate.of(2019, 11,30)) && ordersByDate.dateOfIssue.isBefore(LocalDate.of(2020, 1, 12)));
    }
}

@Test
public void shouldReturnOrdersBetweenValues() throws OrderNotFoundException {
        List<Order> orders = shop.getOrderBasedOnValues(100.00, 400.00);
        assertNotEquals(0, orders.size());
        for (Order values : orders){
            assertTrue(values.getValue() > 100.00 && values.getValue() < 400.00);
        }
}

    @Test
    public void shouldReturnEmptyListWhenThereIsNoResultWithValues() {
        List<Order> result = shop.getOrderBasedOnValues(20.00, 50.00);
        assertEquals(Collections.emptyList(), result);
    }

    @Test
    public void shouldReturnEmptyListWhenThereIsNoResultWithDates() {
        List<Order> orders = shop.returnOrdersBasedOnDates(LocalDate.of(2020, 1, 21), LocalDate.of(2020, 1, 22));
        assertEquals(Collections.emptyList(), orders);
    }

    @Test
    public void shouldReturnOrdersSize() {
        assertEquals(5, shop.getSize());
}

    @Test
    public void shouldReturnOrdersValues() {
        double result = shop.getSum();
        assertEquals(4158.42, shop.getSum(), 0.01);
}

    @BeforeEach
    public void initializeShop() {
        Order noOne = new Order(120.98, LocalDate.of(2019, 3, 20), "John");
        Order noTwo = new Order(250.40, LocalDate.of(2019, 8, 12), "Michael");
        Order noThree = new Order(525.16, LocalDate.of(2020, 1, 20), "Joanna");
        Order noFour = new Order(2056.34, LocalDate.of(2019, 12, 28), "Rebeca");
        Order noFive = new Order(1205.54, LocalDate.of(2019, 10, 1), "Alvin");

        shop.addOrder(noOne);
        shop.addOrder(noTwo);
        shop.addOrder(noThree);
        shop.addOrder(noFour);
        shop.addOrder(noFive);
    }
}