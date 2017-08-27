package com.kodilla.stream.world;

import org.junit.Assert;
import org.junit.Test;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class WorldTestSuite {

    private final World createWorldData() {

        Country poland = new Country(new BigDecimal(4000000));
        Country germany = new Country(new BigDecimal(8000000));
        Country france = new Country(new BigDecimal(7000000));

        Country china = new Country(new BigDecimal(140000000));
        Country india = new Country(new BigDecimal(130000000));
        Country japan = new Country(new BigDecimal(12500000));

        ArrayList europeanCountries = new ArrayList<Country>();
        europeanCountries.add(poland);
        europeanCountries.add(france);
        europeanCountries.add(germany);

        ArrayList asianCountries = new ArrayList<Country>();
        asianCountries.add(china);
        asianCountries.add(india);
        asianCountries.add(japan);

        Continent europe = new Continent(europeanCountries);
        Continent asia = new Continent(asianCountries);

        ArrayList earthContinents = new ArrayList<Continent>();
        earthContinents.add(europe);
        earthContinents.add(asia);

        World earth = new World(earthContinents);

        return earth;

    }

    @Test
    public void testGetPeopleQuantity() {
        //Given
        World earth = createWorldData();

        //When
        BigDecimal earthPopulation = earth.getPeopleQuantity();

        //Then
        Assert.assertEquals((new BigDecimal(301500000)), earthPopulation);
    }
}
