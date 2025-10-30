package com.example.lab08;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
public class CustomListTest {
    @Test
    public void testHasCity() {
        CustomList list = new CustomList();
        City calgary = new City("Calgary", "AB");
        list.addCity(calgary);

        assertTrue(list.hasCity(calgary));
    }


    @Test
    public void testDeleteCity() {
        CustomList list = new CustomList();
        City calgary = new City("Calgary", "AB");
        list.addCity(calgary);

        list.deleteCity(calgary);
        // This will fail initially because deleteCity() doesn't exist
        assertFalse(list.hasCity(calgary));
    }

    @Test
    public void testCountCities() {
        CustomList list = new CustomList();
        City calgary = new City("Calgary", "AB");
        City edmonton = new City("Edmonton", "AB");
        list.addCity(calgary);
        list.addCity(edmonton);
        // This will fail initially because deleteCity() doesn't exist
        assert(list.countCities == 2);
    }
}
