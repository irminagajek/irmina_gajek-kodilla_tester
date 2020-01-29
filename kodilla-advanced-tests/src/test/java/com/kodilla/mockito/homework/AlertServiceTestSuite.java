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
}
