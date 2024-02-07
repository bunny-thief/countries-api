package dev.passingarguments.countriesapi.restcontrollers;

import dev.passingarguments.countriesapi.entity.Country;
import dev.passingarguments.countriesapi.service.CountryService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/countries")
public class CountriesController {

    private CountryService countryService;

    public CountriesController(CountryService countryService) {
        this.countryService = countryService;
    }

    @GetMapping("")
    public List<Country> getCountries() {
        return countryService.findAll();
    }

}

