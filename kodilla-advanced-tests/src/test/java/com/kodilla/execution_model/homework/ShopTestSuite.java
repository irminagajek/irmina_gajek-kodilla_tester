package com.kodilla.execution_model.homework;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ShopTestSuite {

    Shop shop = new Shop();
    Order noOne = new Order(120.98, LocalDate.of(2019, 3, 20), "John");
    Order noTwo = new Order(250.40, LocalDate.of(2019, 8, 12), "Michael");
    Order noThree = new Order(525.16, LocalDate.of(2020, 1, 20), "Joanna");
    Order noFour = new Order(2056.34, LocalDate.of(2019, 12, 28), "Rebeca");
    Order noFive = new Order(1205.54, LocalDate.of(2019, 10, 1), "Alvin");

    @Test
    public void shouldReturnFalseWhenValueIsEmpty() {
        //When
        boolean result = shop.addOrder(new Order(null, LocalDate.of(2020, 1, 12), "Donald"));
        //Then
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
        boolean result = shop.addOrder(new Order(230.45, LocalDate.of(2019, 9, 20), null));
        //Then
        assertFalse(result);
    }

    @Test
    public void shouldAddOrdersToShop() {
        //When
        int numberOfOrders = shop.getSize();
        //Then
        assertEquals(5, numberOfOrders);
    }

@Test
    public void shouldReturnOrdersBetweenDates() throws OrderNotFoundException {
    List<LocalDate> orders = shop.returnOrdersBasedOnDates(LocalDate.of(2019, 11, 30),
            LocalDate.of(2020, 1, 12));
    assertNotEquals(0, orders.size());
}

@Test
public void shouldReturnOrdersBetweenValues() throws OrderNotFoundException {
        List<Order> values = (List<Order>) shop.getOrderBasedOnValues(100.00, 400.00);
        assertNotEquals(0, values.size() );
}

@Test
public void shouldThrewExceptionWhenThereIsNoResultWithValues() throws OrderNotFoundException {
        List<Order> result = shop.getOrderBasedOnValues(20.00, 50.00);
        throw new OrderNotFoundException();
}

@Test
    public void shouldReturnOrdersSize() {
        assertEquals(5, shop.getSize());
}

@Test
public void shouldReturnOrdersValues() {
        double result = shop.getSum();
        assertEquals(4137.44, shop.getSum());
}

    @BeforeEach
    public void initializeShop() {
        shop.addOrder(noOne);
        shop.addOrder(noTwo);
        shop.addOrder(noThree);
        shop.addOrder(noFour);
        shop.addOrder(noFive);
    }
}