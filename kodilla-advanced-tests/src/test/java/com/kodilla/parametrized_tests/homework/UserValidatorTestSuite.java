package com.kodilla.parametrized_tests.homework;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.EmptySource;
import org.junit.jupiter.params.provider.NullSource;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class UserValidatorTestSuite {

    private UserValidator userValidator = new UserValidator();

    @ParameterizedTest
    @ValueSource(strings = {"Ann", "penguin", "DONALD", "20041990", "ann.black", "ann-green", "harry_potter"})
    public void shouldReturnTrueForUsernameMeetingTheRequirements(String username) {
        boolean result = userValidator.validateUsername(username);
        assertTrue(result);
    }

    @ParameterizedTest
    @ValueSource(strings = {"an", "pijany(zajac", "Wiedz min"})
    public void shouldReturnFalseForUsernameNotMeetingTheRequirements(String username) {
        boolean result = userValidator.validateUsername(username);
        assertFalse(result);
    }

    @ParameterizedTest
    @NullSource
    public void shouldReturnFalseIfUsernameIsNull(String username) {
        assertFalse(userValidator.validateUsername(username));
    }

    @ParameterizedTest
    @ValueSource(strings = {"irmina.20@wp.pl", "irmi-na@op.pl", "irmi_90@gmail.com"})
    public void shouldReturnTrueIfEmailMeetingTheRequirements(String email) {
        boolean result = userValidator.validateEmail(email);
        assertTrue(result);
    }

    @ParameterizedTest
    @ValueSource(strings = {"irmiwp.pl", "irmi@wppl"})
    public void shouldReturnFalseIfEmailNotMeetingTheRequirements(String email) {
        boolean result = userValidator.validateEmail(email);
        assertFalse(result);
    }

    @ParameterizedTest
    @EmptySource
    public void shouldReturnFalseIfEmailIsEmpty(String email) {
        assertFalse(userValidator.validateEmail(email));
    }
}