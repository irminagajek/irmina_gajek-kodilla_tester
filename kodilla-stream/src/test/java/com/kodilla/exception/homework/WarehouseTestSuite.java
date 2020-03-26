package com.kodilla.exception.homework;

import org.junit.Test;

import java.util.List;

public class WarehouseTestSuite {

    @Test(expected = OrderDoesntExistException.class)
    public void testGetOrderNumber() throws OrderDoesntExistException {
        //given
        Warehouse warehouse = new Warehouse();
        //when
        List<Order> orders = (List<Order>) warehouse.getOrder("7");
        //then
        throw new OrderDoesntExistException();
    }
}