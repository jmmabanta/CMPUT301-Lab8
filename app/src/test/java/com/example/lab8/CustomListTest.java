package com.example.lab8;


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
        assertEquals(0, customList.getCount());
        customList.addCity(new City("Edmonton", "Alberta"));
        assertEquals(1, customList.getCount());
        customList.addCity(new City("Vancouver", "British Columnbia"));
        assertEquals(2, customList.getCount());
    }

}
