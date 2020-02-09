package com.kodilla.spring.basic.spring_configuration.homework;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class CarApplication {

    @Bean
    public Car chooseCar(String season) {
        String spring = "wiosna";
        String winter = "zima";
        String autumn = "jesień";
        String summer = "lato";

        Car car;
        if (season == spring || season == autumn) {
            car = new Sedan();
        } else if (season == winter) {
            car = new SUV();
        } else {
            car = new Cabrio();
        }
        return car;
    }
}
