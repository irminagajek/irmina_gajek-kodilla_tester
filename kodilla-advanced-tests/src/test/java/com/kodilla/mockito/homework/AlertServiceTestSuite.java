package com.kodilla.mockito.homework;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

public class AlertServiceTestSuite {

    @Test
    public void localSubscribedPersonShouldGetLocalAlerts() {
        AlertService alertService = new AlertService(); //tworzymy obiekt AlertService
        Person person = Mockito.mock(Person.class); //tworzymy osobę
        alertService.subscribe(person, Location.WARSAW); //dodajemy osobę jako subskrybenta do listy lokalnej
        Location location = Mockito.mock(Location.class);

        alertService.alert(Location.WARSAW);
        Mockito.verify(person, Mockito.times(1)).receive(location); //
    }
//
//    @Test
//    public void shouldAddPersonToLocalAlert() {
//        AlertService alertService = new AlertService();
//        Person person = Mockito.mock(Person.class);
//        alertService.subscribe(person, Location.CRACOW);
//        Mockito.verify(person, )
//    //osoba zapisana dostaje 1 raz alert zwiazany z lokalizacja
//    }

    @Test
    public void shouldDeleteSubscriptionFromLocalAlert() {
        AlertService alertService = new AlertService();
        Person person = Mockito.mock(Person.class);
        alertService.subscribe(person, Location.CRACOW);
        Alert alert = Mockito.mock(Alert.class);
        alertService.unsubscribe(person, Location.CRACOW);

        alertService.sendAlert(alert);
        Mockito.verify(person, Mockito.never()).receive("Uwaga!");
    }

    @Test
    public void shouldDeleteSubscriptionFromAllLocations() {
    AlertService alertService = new AlertService();
    Person person = Mockito.mock(Person.class);
    alertService.subscribe(person, Location.CRACOW);
    alertService.subscribe(person, Location.WARSAW);
    Alert alert = Mockito.mock(Alert.class);
    alertService.totalUnsubscribe(person);

    alertService.sendAlert(alert);
    Mockito.verify(person, Mockito.never()).receive("Uwaga!");
    }

    @Test
    public void shouldSentAlertsToAllSubscribedPeople() {
        AlertService alertService = new AlertService();
        Person firstPerson = Mockito.mock(Person.class);
        Person secondPerson = Mockito.mock(Person.class);
        Person thirdPerson = Mockito.mock(Person.class);
        alertService.addSubscriber(firstPerson);
        alertService.addSubscriber(secondPerson);
        alertService.addSubscriber(thirdPerson);
        Alert alert = Mockito.mock(Alert.class);

        alertService.sendAlert(alert);
        Mockito.verify(firstPerson, Mockito.times(1)).receive("Uwaga!");
        Mockito.verify(secondPerson, Mockito.times(1)).receive("Uwaga!");
        Mockito.verify(thirdPerson, Mockito.times(1)).receive("Uwaga!");
    }

    @Test
    public void shouldDeleteLocation() {
    AlertService alertService = new AlertService();
    Alert alert = Mockito.mock(Alert.class);

    alertService.remove(Location.CRACOW);
    alertService.remove(Location.WARSAW);

    //osoba nie może się dopisać do lokalizacji, która nie istnieje
    }
}
