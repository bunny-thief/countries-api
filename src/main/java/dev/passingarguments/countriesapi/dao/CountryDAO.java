package dev.passingarguments.countriesapi.dao;

import dev.passingarguments.countriesapi.entity.Country;

import java.util.List;

public interface CountryDAO {

    List<Country> findAll();

    Country findById(int id);

    Country findByCountryName(String countryName);

    List<Country> findAllCountriesWithFirstLetter(String startingLetter);

    List<Country> findAllByPopulation();

    List<Country> findLargestCountriesByPopulation(int numberOfCountries);

    List<Country> findAllByCapital();

}
