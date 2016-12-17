package com.teamtreehouse.countries.model;

public class Country {
    private String name;
    private int population;
    private String capitalCity;
    private String officialLanguages;
    private String flag;

    public Country(String name, int population, String capitalCity, String officialLanguages, String flag) {
        this.name = name;
        this.population = population;
        this.capitalCity = capitalCity;
        this.officialLanguages = officialLanguages;
        this.flag = flag;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPopulation() {
        return population;
    }

    public void setPopulation(int population) {
        this.population = population;
    }

    public String getCapitalCity() {
        return capitalCity;
    }

    public void setCapitalCity(String capitalCity) {
        this.capitalCity = capitalCity;
    }

    public String getOfficialLanguages() {
        return officialLanguages;
    }

    public void setOfficialLanguages(String officialLanguages) {
        this.officialLanguages = officialLanguages;
    }

    public String getFlag() {
        return flag;
    }

    public void setFlag(String flag) {
        this.flag = flag;
    }
}
