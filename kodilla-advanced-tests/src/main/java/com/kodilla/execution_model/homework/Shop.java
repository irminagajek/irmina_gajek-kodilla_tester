package com.kodilla.execution_model.homework;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Shop {

    private List<Order> orders = new ArrayList<>();

    public boolean addOrder(Order order) {
        return this.orders.add(order);
    }

    public List<LocalDate> returnOrdersBasedOnDates(LocalDate dateA, LocalDate dateB) throws OrderNotFoundException {
        List<Order> foundOrders = new ArrayList<>();
        long numbersBetween = ChronoUnit.DAYS.between(dateA, dateB);
        return IntStream.iterate(0, i -> i + 1)
                .limit(numbersBetween)
                .mapToObj(i -> dateA.plusDays(i))
                .collect(Collectors.toList());

//        for (int n = 0; n < orders.size(); n++) {
//            Order order = orders.get(n);
//            if (order.getDateOfIssue().isAfter(LocalDate.of (dateA) && order.getDateOfIssue().isBefore(dateB))) {
//                foundOrders.add(order);
//        }
//        if (foundOrders.size() > 0) {
//            return foundOrders;
//        } else
//            throw new OrderNotFoundException();
//    }
    }

    public List<Order> getOrderBasedOnValues(double valueMin, double valueMax) throws OrderNotFoundException {
            List<Order> foundValues = new ArrayList<>();
        for (int n = 0; n < orders.size(); n++) {
            Order order = orders.get(n);
            if (order.getValue() > valueMin && order.getValue() < valueMax)
                foundValues.add(order);
        }
            if (foundValues.size() > 0) {
                return foundValues;
            } else
        throw new OrderNotFoundException();
    }

    public int getSize() {
        return this.orders.size();
    }

    public double getSum() {
        double sum = 0;
        for (int n = 0; n < orders.size(); n++) {
            Order order = orders.get(n);
            sum += order.getValue();
        }
        return sum;
    }
}
