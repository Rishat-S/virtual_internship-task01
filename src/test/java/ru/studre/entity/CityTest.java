package ru.studre.entity;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CityTest {

    @Test
    void testToString() {
        City city = new City();
        city.setId(1L);
        city.setName("Адыгейск");
        city.setRegion("Адыгея");
        city.setDistrict("Южный");
        city.setPopulation(12248);
        city.setFoundation("1973");

        assertEquals(
                "City{name='Адыгейск', region='Адыгея', district='Южный', population=12248, foundation='1973'}",
                city.toString());
    }
}