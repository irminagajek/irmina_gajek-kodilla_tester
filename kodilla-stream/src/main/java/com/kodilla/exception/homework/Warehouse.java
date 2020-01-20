package com.kodilla.exception.homework;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Warehouse {

    List<Order> orders = new ArrayList<>();

    public List<Order> getOrderList() {
        return orders;
    }

    public void addOrder(Order order) {
        orders.add(order);
    }

   public Optional<Order> getOrder(String number) throws OrderDoesntExistException {

  Optional<Order> orderNr = orders.stream().filter(x -> x.getNumber().equals(number)).findFirst().orElseThrow(() -> new OrderDoesntExistException);
  return orderNr;
 }

//    public Order getFilteredOrders(String number) throws OrderDoesntExistException {
//    if (getOrderList().contains(number))
//            return getOrderList().get(Integer.parseInt(number));
//        throw new OrderDoesntExistException();
//    }
}
