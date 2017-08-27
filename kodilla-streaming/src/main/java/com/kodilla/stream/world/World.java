package com.kodilla.stream.world;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import static jdk.nashorn.internal.objects.NativeArray.reduce;

public class World {

    private List<Continent> continents = new ArrayList<>();

    public World(final List<Continent> continents) {
        this.continents = continents;
    }

    public final BigDecimal getPeopleQuantity() {

        BigDecimal worldPopulation = continents.stream()
                .flatMap(continent -> continent.getCountries().stream())
                .map(Country::getPeopleQuantity)
                .reduce(BigDecimal.ZERO, (sum, current) -> sum = sum.add(current));

        return worldPopulation;
    }
}
