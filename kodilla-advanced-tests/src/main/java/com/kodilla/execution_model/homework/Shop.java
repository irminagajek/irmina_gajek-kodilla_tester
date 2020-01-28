package com.kodilla.execution_model.homework;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Shop {

    private List<Order> orders = new ArrayList<>();

    public boolean addOrder(Order order) {
        if (order.value <= 0 || order.dateOfIssue == null || order.login == null) {
            return false;
        }
        return this.orders.add(order);
    }

    public List<Order> returnOrdersBasedOnDates(LocalDate dateA, LocalDate dateB) {
        if(this.orders.size() > 0){
            return this.orders.stream()
                    .filter(t -> t.getDateOfIssue().isAfter(dateA) && t.getDateOfIssue().isBefore(dateB))
                    .collect(Collectors.toList());
        }
        return Collections.emptyList();
    }

    public List<Order> getOrderBasedOnValues(double valueMin, double valueMax) {
        if (this.orders.size() > 0) {
            return this.orders.stream()
                    .filter(v -> v.getValue() > valueMin && v.getValue() < valueMax)
                    .collect(Collectors.toList());
        }
        return Collections.emptyList();
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
