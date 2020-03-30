package com.kodilla.mockito.homework;

import java.util.*;

public class AlertService {

    Map<Location, List<Person>> locationAssignments = new HashMap<>();
    private List<Person> people = new ArrayList<>();

    public void subscribe(Person person, Location location) {
        locationAssignments.putIfAbsent(location, new ArrayList<>());
        List<Person> list = locationAssignments.get(location);
        list.add(person);
    }

    public void addSubscriber(Person person) {
        this.people.add(person);
    }

    public void sendAlert(Alert alert) {
        this.people.forEach(person -> person.receive("Uwaga!"));
    }

    public void unsubscribe(Person person, Location location) {
        if (locationAssignments.containsKey(location)) {
            List<Person> list = locationAssignments.get(location);
            list.remove(person);
        }
    }

    public void totalUnsubscribe(Person person) {
        locationAssignments.forEach((location, plist) -> {
         plist.remove(person);
    });

        locationAssignments.values().forEach(plist -> {
            plist.remove(person);
        });
    }

    public void sendLocalAlert(Location location) {
            if (locationAssignments.containsKey(location)) {
                List<Person> list = locationAssignments.get(location);
                list.forEach(p -> p.receive("Uwaga miasto!"));
            }
        }

    public void remove(Location location){
    locationAssignments.remove(location);
    }
}
