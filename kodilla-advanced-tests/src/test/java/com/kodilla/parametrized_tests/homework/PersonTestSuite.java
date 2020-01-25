package com.kodilla.parametrized_tests.homework;


import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.jupiter.params.provider.NullSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

class PersonTestSuite {

@Test
    public void testBMI() {
    Person person = new Person(1.68, 53);
    String result = person.getBMI();
    assertEquals("Normal (healthy weight)", result);
}

@ParameterizedTest
@MethodSource(value = "com.kodilla.parametrized_tests.homework.DoubleSources#provideDoublesForTesting")
    public void shouldShowBMIResult(Person person, String expected) {
    assertEquals(expected, person.getBMI());
    }

    @ParameterizedTest
    @NullSource
    public void shouldReturnAnythingIfStringIsNull(Person person, String expected) {
        assertEquals(expected, person.getBMI());
    }

}