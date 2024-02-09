package dev.passingarguments.countriesapi.service;

import dev.passingarguments.countriesapi.entity.Country;

import java.util.List;

public interface CountryService {

    List<Country> findAll();

    Country findById(int id);

    Country findByName(String countryName);

    List<Country> findAllCountriesWithFirstLetter(String firstLetter);

    List<Country> findAllByPopulation();

    List<Country> findLargestCountriesByPopulation(int numberOfCountries);

    List<Country> findAllByCapital();

    Country findByCapital(String capital);

    List<Country> findAllCapitalsWithFirstLetter(String firstLetter);

}
