package com.kodilla.parametrized_tests.homework;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

public class GamblingMachineTestSuite {

@ParameterizedTest
@CsvFileSource(resources = "/userNumbers.csv")
    public void shouldThrowExceptionIfValidatedNumbersAreLessThanSix(String no1, String no2, String no3, String no4, String no5, String no6, String no7) throws InvalidNumbersException {
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
}