package com.kodilla.parametrized_tests.homework;

import org.junit.jupiter.params.provider.Arguments;

import java.util.stream.Stream;

public class DoubleSources {

    static Stream<Arguments> provideDoublesForTesting() {
        return Stream.of(
                Arguments.of(new Person(1.78, 45), "Very severely underweight"),
                Arguments.of(new Person(1.69, 44), "Severely underweight"),
                Arguments.of(new Person(1.64, 46), "Underweight"),
                Arguments.of(new Person(1.55, 53), "Normal (healthy weight)"),
                Arguments.of(new Person(1.60, 72), "Overweight"),
                Arguments.of(new Person(1.80, 105), "Obese Class I (Moderately obese)"),
                Arguments.of(new Person(1.73, 114), "Obese Class II (Severely obese)"),
                Arguments.of(new Person(1.69, 123), "Obese Class III (Very severely obese)"),
                Arguments.of(new Person(1.67, 136), "Obese Class IV (Morbidly Obese)"),
                Arguments.of(new Person(1.85, 175), "Obese Class V (Super Obese)"),
                Arguments.of(new Person(1.70, 178), "Obese Class VI (Hyper Obese)")
        );
    }
}
