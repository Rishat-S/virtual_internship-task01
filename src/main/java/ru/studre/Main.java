package ru.studre;

import ru.studre.entity.City;
import ru.studre.service.CityService;

import java.io.IOException;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import static ru.studre.constants.Constants.CITY_DIRECTORY_FILE_PATH;

public class Main {
    public static void main(String[] args) throws IOException {
        CityService cityService = new CityService();

        /* Четвёртое задание */
        countCityByRegion(cityService);
    }

    private static void countCityByRegion(CityService cityService) throws IOException {
        Map<String, List<City>> stringListMap = cityService.getCities(CITY_DIRECTORY_FILE_PATH).stream()
                .collect(Collectors.groupingBy(City::getRegion));
        for (Map.Entry<String, List<City>> pair: stringListMap.entrySet()) {
            System.out.println(pair.getKey() + "-" + pair.getValue().size());
        }
    }

}
