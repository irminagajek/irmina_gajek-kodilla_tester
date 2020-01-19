package com.kodilla.exception.homework;

import java.util.ArrayList;
import java.util.List;

public class Warehouse {

    public static List<Order> getOrderList() {
        List<Order> orders = new ArrayList<>();
        return orders;
    }

    public static void addOrder(Order order) {
        List<Order> orders = new ArrayList<>();
        orders.add(new Order(order.toString()));
    }

    public static Order getOrder(String number) throws OrderDoesntExistException {
        Warehouse.getOrderList()
                .stream()
                .filter(o -> o.getNumber().equals(number));
              //  .forEach(os -> System.out.println(os));
        return getOrder(number);
    }

    public static Order getFilteredOrders(String number) throws OrderDoesntExistException {
    if (getOrderList().contains(number))
            return getOrderList().get(Integer.parseInt(number));
        throw new OrderDoesntExistException();
    }
}
