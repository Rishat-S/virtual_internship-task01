package ru.studre.service;

import ru.studre.entity.City;
import ru.studre.repository.CityRepository;

import java.io.IOException;
import java.util.List;

public class CityService {
    CityRepository cityRepository = new CityRepository();

    public List<City> getCities() throws IOException {
        return cityRepository.getCities();
    }
}
