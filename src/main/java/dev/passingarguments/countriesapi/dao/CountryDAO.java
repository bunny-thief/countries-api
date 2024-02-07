package dev.passingarguments.countriesapi.dao;

import dev.passingarguments.countriesapi.entity.Country;

import java.util.List;

public interface CountryDAO {

    List<Country> findAll();

}
