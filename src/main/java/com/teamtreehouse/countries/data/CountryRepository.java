package com.teamtreehouse.countries.data;

import com.teamtreehouse.countries.model.Country;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.List;

@Component
public class CountryRepository {
    private static final List<Country> ALL_COUNTRIES = Arrays.asList(
            new Country("Canada", "36,286,425", "Ottawa", "English, French", "Flag_of_Canada"),
            new Country("Brazil", "206,440,850", "Brasilia", "Portuguese", "Flag_of_Brazil"),
            new Country("France","66,736,000", "Paris", "French", "Flag_of_France"),
            new Country("Germany", "82,175,700", "Berlin", "German", "Flag_of_Germany"),
            new Country("Belgium", "11,250,585", "Brussels", "Dutch, French, German", "Flag_of_Belgium")
    );

    public Country findByName(String name) {
        for(Country country : ALL_COUNTRIES) {
            if (country.getName().equals(name)) {
                return country;
            }
        }
        return null;
    }

    public List<Country> getAllCountries() {
        return ALL_COUNTRIES;
    }
}
