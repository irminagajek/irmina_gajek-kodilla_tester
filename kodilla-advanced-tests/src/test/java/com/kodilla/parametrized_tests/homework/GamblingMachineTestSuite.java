package com.kodilla.parametrized_tests.homework;

import org.junit.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.ValueSource;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class GamblingMachineTestSuite {

    @ParameterizedTest
    @CsvFileSource(resources = "/userNumbers.csv")
    public void shouldThrowExceptionIfValidatedNumbersAreMoreThanSix(String no1, String no2, String no3, String no4, String no5, String no6, String no7) throws InvalidNumbersException {
        //given
        GamblingMachine gamblingMachine = new GamblingMachine();

        Set<String> setOfString = new HashSet<>(
                Arrays.asList(no1, no2, no3, no4, no5, no6));
        Set<Integer> setOfInteger = setOfString.stream()
                .map(Integer::parseInt)
                .collect(Collectors.toSet());
        //when
        int howManyWins = gamblingMachine.howManyWins(setOfInteger);
        //then
        throw new InvalidNumbersException();
    }

    @ParameterizedTest
    @CsvFileSource(resources = "/userNumbers1.csv")
    public void shouldThrowExceptionIfValidatedNumbersAreLessThanSix(String no1, String no2, String no3) throws InvalidNumbersException {
        //given
        GamblingMachine gamblingMachine = new GamblingMachine();

        Set<String> setOfString = new HashSet<>(
                Arrays.asList(no1, no2, no3));
        Set<Integer> setOfInteger = setOfString.stream()
                .map(Integer::parseInt)
                .collect(Collectors.toSet());
        //when
        int howManyWins = gamblingMachine.howManyWins(setOfInteger);
        //then
        assertThrows(NullPointerException.class, () -> {
            Integer.parseInt("/userNumbers1.csv");
        });
    }


    @ParameterizedTest
    @ValueSource
    public void shouldReturnExceptionIfNumberIsLowerThenOne(String n1, String n2, String n3, String n4, String n5, String n6) throws InvalidNumbersException {
        GamblingMachine gamblingMachine = new GamblingMachine();
        Set<String> setOfString = new HashSet<>(
                Arrays.asList(n1, n2, n3, n4, n5, n6));
        Set<Integer> setOfInteger = setOfString
                .stream()
                .filter(n -> n.equals(0))
                .map(Integer::parseInt)
                .collect(Collectors.toSet());
        throw new InvalidNumbersException();
    }

    @Test
    public void shouldPassedIfNumberIsSix() throws InvalidNumbersException {
        GamblingMachine gamblingMachine = new GamblingMachine();
        Set<Integer> numbers = Stream.of(1,2,3,4,5,6).collect(Collectors.toSet());
        int number = gamblingMachine.howManyWins(Collections.singleton(numbers.size()));
        assertEquals(6, numbers.size());
    }

}