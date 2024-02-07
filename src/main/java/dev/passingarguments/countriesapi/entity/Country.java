package dev.passingarguments.countriesapi.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "country")
public class Country {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "country_name")
    private String countryName;

    @Column(name = "capital")
    private String capital;

    @Column(name = "population")
    private int population;

    public Country() {
    }

    public Country(String countryName, String capital, int population) {
        this.countryName = countryName;
        this.capital = capital;
        this.population = population;
    }

    public String getCountryName() {
        return countryName;
    }

    public void setCountryName(String countryName) {
        this.countryName = countryName;
    }

    public String getCapital() {
        return capital;
    }

    public void setCapital(String capital) {
        this.capital = capital;
    }

    public int getPopulation() {
        return population;
    }

    public void setPopulation(int population) {
        this.population = population;
    }

    @Override
    public String toString() {
        return "Country{" +
                "id=" + id +
                ", countryName='" + countryName + '\'' +
                ", capital='" + capital + '\'' +
                ", population=" + population +
                '}';
    }

}
