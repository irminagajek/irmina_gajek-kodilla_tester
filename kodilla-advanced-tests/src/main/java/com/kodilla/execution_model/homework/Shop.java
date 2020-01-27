package com.kodilla.execution_model.homework;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Shop {

    private List<Order> orders = new ArrayList<>();

    public boolean addOrder(Order order) {
        return this.orders.add(order);
    }

    public List<Order> returnOrdersBasedOnDates(Date dateA, Date dateB) throws OrderNotFoundException {
        List<Order> foundOrders = new ArrayList<>();
        for (int n = 0; n < orders.size(); n++) {
            Order order = orders.get(n);
            if (order.getDateOfIssue().after(dateA) && order.getDateOfIssue().before(dateB))
                foundOrders.add(order);
            return foundOrders;
        }
        throw new OrderNotFoundException();
    }

    public Order getOrderBasedOnValues(double valueMin, double valueMax) throws OrderNotFoundException {
        for (int n = 0; n < orders.size(); n++) {
            Order order = orders.get(n);
            if (order.getValue() > valueMin && order.getValue() < valueMax)
                return order;
        }
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
