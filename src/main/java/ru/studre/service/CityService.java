package ru.studre.service;

import ru.studre.entity.City;
import ru.studre.repository.CityRepository;

import java.io.IOException;
import java.util.Set;

public class CityService {
    CityRepository cityRepository = new CityRepository();

    public Set<City> getCities(String cityDirectoryFilePath) throws IOException {
        return cityRepository.getCities(cityDirectoryFilePath);
    }
}
