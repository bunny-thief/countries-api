package dev.passingarguments.countriesapi.service;

import dev.passingarguments.countriesapi.dao.CountryDAO;
import dev.passingarguments.countriesapi.entity.Country;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CountryServiceImplementation implements CountryService {

    private CountryDAO countryDAO;

    public CountryServiceImplementation(CountryDAO countryDAO) {
        this.countryDAO = countryDAO;
    }

    @Override
    public List<Country> findAll() {
        return countryDAO.findAll();
    }

    @Override
    public Country findById(int id) {
        return countryDAO.findById(id);
    }

}
