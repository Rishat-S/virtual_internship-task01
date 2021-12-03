package ru.studre;

import ru.studre.repository.CityRepository;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        CityRepository cityRepository = new CityRepository();

        cityRepository.getCities().forEach(System.out::println);
    }
}
