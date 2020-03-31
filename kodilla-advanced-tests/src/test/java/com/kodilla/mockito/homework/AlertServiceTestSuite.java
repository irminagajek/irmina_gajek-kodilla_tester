package com.kodilla.mockito.homework;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

public class AlertServiceTestSuite {

    @Test
    public void localSubscribedPersonShouldGetLocalAlerts() {
        AlertService alertService = new AlertService();
        Person person = Mockito.mock(Person.class);
        Person personCracow = Mockito.mock(Person.class);
        alertService.subscribe(person, Location.WARSAW);
        alertService.subscribe(personCracow, Location.CRACOW);

        alertService.sendLocalAlert(Location.WARSAW);
        Mockito.verify(person, Mockito.times(1)).receive("Uwaga miasto!");
        Mockito.verify(personCracow, Mockito.never()).receive("Uwaga miasto!");
    }

    @Test
    public void shouldDeleteSubscriptionFromLocalAlert() {
        AlertService alertService = new AlertService();
        Person person = Mockito.mock(Person.class);
        alertService.subscribe(person, Location.CRACOW);
        alertService.unsubscribe(person, Location.CRACOW);

        alertService.sendLocalAlert(Location.CRACOW);
        Mockito.verify(person, Mockito.never()).receive("Uwaga miasto!");
    }

    @Test
    public void shouldDeleteSubscriptionFromAllLocations() {
    AlertService alertService = new AlertService();
    Person person = Mockito.mock(Person.class);
    alertService.subscribe(person, Location.CRACOW);
    alertService.subscribe(person, Location.WARSAW);
    alertService.totalUnsubscribe(person);

    alertService.sendAlert();
    Mockito.verify(person, Mockito.never()).receive("Uwaga!");
    }

    @Test
    public void shouldSentAlertsToAllSubscribedPeople() {
        AlertService alertService = new AlertService();
        Person firstPerson = Mockito.mock(Person.class);
        Person secondPerson = Mockito.mock(Person.class);
        Person thirdPerson = Mockito.mock(Person.class);

        alertService.addLocation(Location.WARSAW);
        alertService.addLocation(Location.CRACOW);

        alertService.addSubscriber(firstPerson);
        alertService.addSubscriber(secondPerson);
        alertService.addSubscriber(thirdPerson);

        alertService.sendAlert();
        Mockito.verify(firstPerson, Mockito.times(2)).receive("Uwaga!");
        Mockito.verify(secondPerson, Mockito.times(2)).receive("Uwaga!");
        Mockito.verify(thirdPerson, Mockito.times(2)).receive("Uwaga!");
    }

    @Test
    public void shouldDeleteLocation() {
    AlertService alertService = new AlertService();

    alertService.addLocation(Location.CRACOW);
    alertService.addLocation(Location.WARSAW);
    alertService.removeLocation(Location.CRACOW);
    alertService.removeLocation(Location.WARSAW);

    Person person = Mockito.mock(Person.class);
    alertService.sendLocalAlert(Location.CRACOW);
    alertService.sendLocalAlert(Location.WARSAW);
    Mockito.verify(person, Mockito.never()).receive("Uwaga miasto!");
    }
}
