package ru.studre;

import ru.studre.entity.City;
import ru.studre.service.CityService;

import java.io.IOException;
import java.util.Comparator;

import static ru.studre.constants.Constants.CITY_DIRECTORY_FILE_PATH;

public class Main {
    public static void main(String[] args) throws IOException {
        CityService cityService = new CityService();

        /* Первое задание */
        cityService.getCities(CITY_DIRECTORY_FILE_PATH).forEach(System.out::println);

        /* Второе задание */
        // 2.1 Сортировка списка городов по наименованию в алфавитном порядке по убыванию без учета регистра
        cityService.getCities(CITY_DIRECTORY_FILE_PATH).stream()
                .sorted(Comparator.comparing(City::getName))
                .forEach(System.out::println);

        // 2.2 Сортировка списка городов по федеральному округу
        // и наименованию города внутри каждого федерального округа в алфавитном порядке по убыванию с учетом регистра
        cityService.getCities(CITY_DIRECTORY_FILE_PATH).stream()
                .sorted(Comparator.comparing(City::getDistrict)
                        .thenComparing(City::getName))
                .forEach(System.out::println);

    }
}
