package com.kodilla.exception.homework;

import java.util.ArrayList;
import java.util.List;

public class Warehouse {

    List<Order> orders = new ArrayList<>();

    public List<Order> getOrderList() {
        return orders;
    }

    public void addOrder(Order order) {
        orders.add(order);
    }

   public Order getOrder(String number) throws OrderDoesntExistException {

  Order orderNr = orders.stream()
          .filter(x -> x.getNumber().equals(number))
          .findFirst()
          .orElseThrow(() -> new OrderDoesntExistException());

  return orderNr;
 }
}
