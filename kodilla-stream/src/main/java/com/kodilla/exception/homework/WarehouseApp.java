package com.kodilla.exception.homework;

import com.kodilla.exception.UserDialogs;

import java.util.ArrayList;
import java.util.List;

public class WarehouseApp {
    public static void main(String[] args) throws OrderDoesntExistException {
        List<Warehouse> orders = new ArrayList<>();
        Warehouse.addOrder(new Order("1"));
        Warehouse.addOrder(new Order("2"));
        Warehouse.addOrder(new Order("3"));
        Warehouse.addOrder(new Order("4"));
        Warehouse.addOrder(new Order("5"));

        Order numberOfOrder = Warehouse.getFilteredOrders(new Order("4"));
        System.out.println("Number of order : " + Warehouse.getFilteredOrders());
    }
}