package com.kodilla.exception.homework;

import java.util.ArrayList;
import java.util.List;

public class WarehouseApp {
    public static void main(String[] args) throws OrderDoesntExistException {
        List<Warehouse> orders = new ArrayList<>();

        Warehouse warehouse = new Warehouse();
        warehouse.addOrder(new Order("1"));
        warehouse.addOrder(new Order("2"));
        warehouse.addOrder(new Order("3"));
        warehouse.addOrder(new Order("4"));
        warehouse.addOrder(new Order("5"));

        System.out.println(warehouse.getOrderList());

        System.out.println(warehouse.getOrder("6"));

    }
}