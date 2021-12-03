package ru.studre.repository;

import ru.studre.entity.City;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;

public class CityRepository {
    private final Set<City> cities;

    public CityRepository() {
        cities = new HashSet<>();
    }

    public Set<City> getCities(String cityDirectoryFilePath) throws IOException {
        return getCitiesFromCsvFile(cityDirectoryFilePath);
    }

    private Set<City> getCitiesFromCsvFile(String cityDirectoryFilePath) {
        try (BufferedReader bufferedReader = new BufferedReader(
                new InputStreamReader(new FileInputStream(cityDirectoryFilePath)));){
            while (true) {
                String[] dataLineOfCsvFile;
                try {
                    dataLineOfCsvFile = bufferedReader.readLine().split(";");
                } catch (NullPointerException e) {
                    break;
                }
                addCityToSet(dataLineOfCsvFile);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        return cities;

    }

    private void addCityToSet(String[] dataLineOfCsvFile) {
        City city = new City();
        city.setId(Long.parseLong(dataLineOfCsvFile[0]));
        city.setName(dataLineOfCsvFile[1]);
        city.setRegion(dataLineOfCsvFile[2]);
        city.setDistrict(dataLineOfCsvFile[3]);
        city.setPopulation(Integer.parseInt(dataLineOfCsvFile[4]));
        if (dataLineOfCsvFile.length == 6) {
            city.setFoundation(dataLineOfCsvFile[5]);
        }

        cities.add(city);

    }

}
