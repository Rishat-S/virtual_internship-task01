package ru.studre;

import ru.studre.comparators.ByCityNameCaseInsensitive;
import ru.studre.entity.City;
import ru.studre.service.CityService;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import static ru.studre.constants.Constants.CITY_DIRECTORY_FILE_PATH;

public class Main {
    public static void main(String[] args) throws IOException {
        CityService cityService = new CityService();

        /* Второе задание */
        // 2.1 Сортировка списка городов по наименованию в алфавитном порядке по убыванию без учета регистра
        List<City> cityList = new ArrayList<>(cityService.getCities(CITY_DIRECTORY_FILE_PATH));
        cityList.sort(new ByCityNameCaseInsensitive());
        cityList.forEach(System.out::println);

        // 2.2 Сортировка списка городов по федеральному округу
        // и наименованию города внутри каждого федерального округа в алфавитном порядке по убыванию с учетом регистра
        cityService.getCities(CITY_DIRECTORY_FILE_PATH).stream()
                .sorted(Comparator.comparing(City::getDistrict)
                        .thenComparing(City::getName))
                .forEach(System.out::println);

    }
}
