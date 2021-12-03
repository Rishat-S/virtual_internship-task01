package ru.studre;

import ru.studre.service.CityService;

import java.io.IOException;

import static ru.studre.constants.Constants.CITY_DIRECTORY_FILE_PATH;

public class Main {
    public static void main(String[] args) throws IOException {
        CityService cityService = new CityService();

        cityService.getCities(CITY_DIRECTORY_FILE_PATH).forEach(System.out::println);
    }
}
