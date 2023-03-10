package com.example.lab8;


import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;


//import org.junit.Before;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

public class CustomListTest {

    private CustomList customList;

    @BeforeEach
    private void setUp() {
        customList = new CustomList(null, new ArrayList<>());
    }

    @Test
    public void testAddCities() {
        assertEquals(0, customList.countCities());
        customList.addCity(new City("Edmonton", "Alberta"));
        assertEquals(1, customList.countCities());
        customList.addCity(new City("Vancouver", "British Columnbia"));
        assertEquals(2, customList.countCities());
    }

    @Test
    public void testHasCity() {
        City edmonton = new City("Edmonton", "Alberta");
        customList.addCity(edmonton);
        assertEquals(1, customList.countCities());
        assertTrue(customList.hasCity(edmonton));
    }

    @Test
    public void testDeleteCity() {
        City edmonton = new City("Edmonton", "Alberta");
        customList.addCity(edmonton);
        assertEquals(1, customList.countCities());
        assertTrue(customList.hasCity(edmonton));
        customList.deleteCity(edmonton);
        assertEquals(0, customList.countCities());
        assertFalse(customList.hasCity(edmonton));
    }

    @Test
    public void testCountCities() {
        assertEquals(0, customList.countCities());
        City edmonton = new City("Edmonton", "Alberta");
        City toronto = new City("Toronton", "Ontario");
        City regina = new City("Regina", "Saskatchewan");
        customList.addCity(edmonton);
        assertEquals(1, customList.countCities());
        customList.addCity(toronto);
        assertEquals(2, customList.countCities());
        customList.addCity(regina);
        assertEquals(3, customList.countCities());
        customList.deleteCity(edmonton);
        assertEquals(2, customList.countCities());
        customList.deleteCity(regina);
        assertEquals(1, customList.countCities());
        customList.deleteCity(toronto);
        assertEquals(0, customList.countCities());
    }



}
