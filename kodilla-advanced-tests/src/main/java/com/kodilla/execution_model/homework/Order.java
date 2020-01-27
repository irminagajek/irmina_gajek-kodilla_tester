package com.kodilla.execution_model.homework;

import java.util.Date;

public class Order {

    private double value;
    private Date dateOfIssue;
    private String login;

    public Order(double value, Date dateOfIssue, String login) {
        this.value = value;
        this.dateOfIssue = dateOfIssue;
        this.login = login;
    }

    public double getValue() {
        return value;
    }

    public Date getDateOfIssue() {
        return dateOfIssue;
    }

    public String getLogin() {
        return login;
    }

    @Override
    public String toString() {
        return "Order{" +
                "value=" + value +
                ", dateOfIssue=" + dateOfIssue +
                ", login='" + login + '\'' +
                '}';
    }
}
