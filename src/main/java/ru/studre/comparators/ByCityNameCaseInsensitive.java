package ru.studre.comparators;

import ru.studre.entity.City;

import java.util.Comparator;

public class ByCityNameCaseInsensitive implements Comparator<City> {
    @Override
    public int compare(City city1, City city2) {
        return city1.getName().compareToIgnoreCase(city2.getName());
    }
}
