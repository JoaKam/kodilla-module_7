package com.kodilla.stream.world;

import java.math.BigDecimal;

public class Country {

    private final BigDecimal peopleQuantity;

    public Country(final BigDecimal peopleQuantity) {
        this.peopleQuantity = peopleQuantity;
    }

    public final BigDecimal getPeopleQuantity() {
        return peopleQuantity;
    }

}
