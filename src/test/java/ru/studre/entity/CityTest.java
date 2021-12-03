package ru.studre.entity;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CityTest {

    @Test
    void testToString() {
        City city = new City(
                1L,
                "Адыгейск",
                "Адыгея",
                "Южный",
                12248,
                "1973");

        assertEquals(
                "City{name='Адыгейск', region='Адыгея', district='Южный', population=12248, foundation='1973'}",
                city.toString());
    }
}