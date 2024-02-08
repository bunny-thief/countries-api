package dev.passingarguments.countriesapi.dao;

import dev.passingarguments.countriesapi.entity.Country;
import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class CountryDAOImplementation implements CountryDAO {

    private EntityManager entityManager;

    public CountryDAOImplementation(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    @Override
    public List<Country> findAll() {
        TypedQuery<Country> query = entityManager.createQuery("FROM Country", Country.class);

        List<Country> countries = query.getResultList();

        return countries;
    }

    @Override
    public Country findById(int id) {
        return entityManager.find(Country.class, id);
    }

    @Override
    public Country findByCountryName(String countryName) {
        TypedQuery<Country> query = entityManager.createQuery("From Country c WHERE c.countryName=:countryName", Country.class);
        query.setParameter("countryName", countryName);

        return query.getSingleResult();
    }

    @Override
    public List<Country> findAllByPopulation() {
        TypedQuery<Country> query = entityManager.createQuery("FROM Country ORDER BY (population) DESC", Country.class);

        return query.getResultList();
    }

    @Override
    public List<Country> findLargestCountriesByPopulation(int numberOfCountries) {
        TypedQuery<Country> query = entityManager.createQuery("FROM Country ORDER BY (population) DESC ", Country.class);
        query.setMaxResults(numberOfCountries);
        List<Country> countries = query.getResultList();
        return countries;
    }

    @Override
    public List<Country> findAllByCapital() {
        TypedQuery<Country> query = entityManager.createQuery("FROM Country ORDER BY (capital)", Country.class);
        List<Country> countries = query.getResultList();

        return countries;
    }

}
