package com.kodilla.execution_model.homework;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ShopTestSuite {

    Shop shop = new Shop();
    Order noOne = new Order(500.00, 2010-03-20, "John");
    Order noTwo = new Order(250.40, 2010-03-20, "Michael");
    Order noThree = new Order(125.16, 2010-03-20, "Joanna");
    Order noFour = new Order(2056.34, 2010-03-20, "Rebeca");
    Order noFive = new Order(1205.54, 2010-03-20, "Alvin");

    @Test
    public void shouldAddOrdersToShop() {
        //When
        int numberOfOrders = shop.getSize();
        //Then
        assertEquals(5, numberOfOrders);
    }

@Test
    public void shouldReturnOrdersBetweenDates() {
    Order result = shop.returnOrdersBasedOnDates(12-01-2019, 23-12-2020);
    List<Order> foundOrders = new ArrayList<>();
    assertEquals(foundOrders, result.getDateOfIssue());
}

@Test
public void shouldReturnOrdersBetweenValues() throws OrderNotFoundException {
        Order result = shop.getOrderBasedOnValues(100.00, 300.00);
    List<Order> ordersValues = new ArrayList<>();
    ordersValues.add(noTwo);
    ordersValues.add(noThree);
    assertEquals(ordersValues, result.getValue());
}

@Test
public void shouldThrewExceptionWhenThereIsNoResultWithValues() throws OrderNotFoundException {
        Order result = shop.getOrderBasedOnValues(20.00, 50.00);
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