package com.kodilla.stream.world;

import java.util.HashSet;
import java.util.Set;

public final class Continent {

    private final String name;

    private final Set<Country> countries = new HashSet<>();

    public Continent(final String name) {
        this.name = name;
    }

    public Set<Country> getCountries() {
        return countries;
    }

    public void addCountry(Country country) {
        countries.add(country);
    }

}

