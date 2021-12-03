package ru.studre;

import ru.studre.service.CityService;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        CityService cityService = new CityService();

        cityService.getCities().forEach(System.out::println);
    }
}
