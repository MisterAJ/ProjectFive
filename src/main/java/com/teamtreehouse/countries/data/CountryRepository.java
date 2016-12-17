package com.teamtreehouse.countries.data;

import com.teamtreehouse.countries.model.Country;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.List;

@Component
public class CountryRepository {
    private static final List<Country> ALL_COUNTRIES = Arrays.asList(
            new Country("Canada", 36286425, "Ottawa", "English, French", "Flag_of_Canada"),
            new Country("Brazil", 206440850, "Brasilia", "Portuguese", "Flag_of_Brazil"),
            new Country("France",66736000, "Paris", "French", "Flag_of_France"),
            new Country("Germany", 82175700, "Berlin", "German", "Flag_of_Germany"),
            new Country("Belgium", 11250585, "Brussels", "Dutch, French, German", "Flag_of_Belgium")
    );

    public Country findByName(String name) {
        for(Country country : ALL_COUNTRIES) {
            if (country.getName().equals(name)) {
                return country;
            }
        }
        return null;
    }
}
