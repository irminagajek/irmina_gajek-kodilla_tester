package com.kodilla.execution_model.homework;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class ShopTestSuite2 {

    Shop shop = new Shop();
    private List<Order> orders = new ArrayList<>();

    @Test
    public void shouldReturnZeroSizeWhenThereAreNoOrders() {
        assertEquals(0, orders.size());
    }

    @Test
    public void shouldReturnZeroWhenThereAreNoValues() {
        double result = shop.getSum();
        assertEquals(0, result,0.00);
    }
}
