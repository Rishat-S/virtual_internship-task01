package ru.studre;

import ru.studre.entity.City;
import ru.studre.service.CityService;

import java.io.IOException;

import static ru.studre.constants.Constants.CITY_DIRECTORY_FILE_PATH;

public class Main {
    public static void main(String[] args) throws IOException {
        CityService cityService = new CityService();

        /* Третье задание */
        getCityWithMaxPopulation(cityService);

    }

    private static void getCityWithMaxPopulation(CityService cityService) throws IOException {
        City[] cities = cityService.getCities(CITY_DIRECTORY_FILE_PATH).toArray(City[]::new);

        Integer maxPopulation = cities[0].getPopulation();
        int indexOfCityWithMaxPopulation = 0;
        for (int i = 1; i < cities.length; i++) {
            if (cities[i].getPopulation() > maxPopulation) {
                maxPopulation = cities[i].getPopulation();
                indexOfCityWithMaxPopulation = i;
            }
        }
        System.out.println("[" + indexOfCityWithMaxPopulation + "]" + "=" + maxPopulation);
    }
}
