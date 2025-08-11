package com.kodilla.stream.world;

import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class WorldTestSuite {

    @Test
    void testGetPeopleQuantity() {
        //Given
        Continent continent1 = new Continent("Europe");
        Continent continent2 = new Continent("Africa");
        Continent continent3 = new Continent("Asia");

        continent1.addCountry(new Country("Poland", new BigDecimal("36547653")));
        continent1.addCountry(new Country("Germany", new BigDecimal("83500400")));
        continent1.addCountry(new Country("France", new BigDecimal("68514231")));

        continent2.addCountry(new Country("Egypt", new BigDecimal("109876000")));
        continent2.addCountry(new Country("RPA", new BigDecimal("64010342")));
        continent2.addCountry(new Country("Sudan", new BigDecimal("50455000")));

        continent3.addCountry(new Country("China", new BigDecimal("1409000000")));
        continent3.addCountry(new Country("India", new BigDecimal("1451000342")));
        continent3.addCountry(new Country("Cambodia", new BigDecimal("17869544")));

        World world = new World();
        world.addContinent(continent1);
        world.addContinent(continent2);
        world.addContinent(continent3);

        //When
        BigDecimal actualPeopleQuantity = world.getPeopleQuantity();

        //Then
        assertEquals(3, world.getContinents().size());
        assertEquals(new BigDecimal("3290773512"), actualPeopleQuantity);
    }
}
