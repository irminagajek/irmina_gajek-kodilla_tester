package com.kodilla.spring.basic.dependency_injection.homework;

public class PocztaPolskaDeliveryService implements DeliveryService {

    @Override
    public boolean deliverPackage(String address, double weight) {
        return false;
    }
}