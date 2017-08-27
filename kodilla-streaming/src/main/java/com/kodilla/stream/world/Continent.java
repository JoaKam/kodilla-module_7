package com.kodilla.stream.world;

import java.util.ArrayList;
import java.util.List;

public class Continent {

    private List<Country> countries = new ArrayList<>();

    public Continent(final List<Country> countries) {
        this.countries = countries;
    }

    public final List<Country> getCountries() {
        return countries;
    }
}
