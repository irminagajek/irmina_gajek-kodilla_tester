package com.kodilla.parametrized_tests.homework;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class UserValidatorTestSuite {

    private UserValidator userValidator = new UserValidator();

    @Test
    public void shouldReturnTrueIfUsernameContainsThreeSigns() {
        boolean result = userValidator.validateUsername("Ann");
        assertTrue(result);
    }

    @Test
    public void shouldReturnTrueIfUsernameContainsLowerCase() {
        boolean result = userValidator.validateUsername("penguin");
        assertTrue(result);
    }

    @Test
    public void shouldReturnTrueIfUsernameContainsUpperCase() {
        boolean result = userValidator.validateUsername("DONALD");
        assertTrue(result);
    }

    @Test
    public void shouldReturnTrueIfUsernameContainsDigits() {
        boolean result = userValidator.validateUsername("20041990");
        assertTrue(result);
    }

    @Test
    public void shouldReturnTrueIfUsernameContainsDot() {
        boolean result = userValidator.validateUsername("ann.black");
        assertTrue(result);
    }

    @Test
    public void shouldReturnTrueIfUsernameContainsDash() {
        boolean result = userValidator.validateUsername("ann-green");
        assertTrue(result);
    }

    @Test
    public void shouldReturnTrueIfUsernameContainsUnderline() {
        boolean result = userValidator.validateUsername("harry_potter");
        assertTrue(result);
    }

    @Test
    public void shouldReturnFalseIfUsernameContainsLessThanThreeSigns() {
        boolean result = userValidator.validateUsername("an");
        assertFalse(result);
    }

    @Test
    public void shouldReturnFalseIfUserNameContainsBracket() {
        boolean result = userValidator.validateUsername("pijany(zajac");
        assertFalse(result);
    }

    @Test
    public void shouldReturnFalseIfUserNameContainsSpace() {
        boolean result = userValidator.validateUsername("Wiedz min");
        assertFalse(result);
    }

    @ParameterizedTest
    @ValueSource(strings = {"Ann", "penguin", "DONALD", "20041990", "ann.black", "ann-green", "harry_potter"})
    public void shouldReturnTrueForUserNamesMeetingTheRequirements(String username) {
        boolean result = userValidator.validateUsername(username);
        assertTrue(result);
    }
}