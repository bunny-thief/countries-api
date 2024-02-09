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
        TypedQuery<Country> query = entityManager.
                createQuery("FROM Country", Country.class);

        List<Country> countries = query.getResultList();

        return countries;
    }

    @Override
    public Country findById(int id) {
        return entityManager.find(Country.class, id);
    }

    @Override
    public Country findByCountryName(String countryName) {
        TypedQuery<Country> query = entityManager.
                createQuery("From Country c WHERE c.countryName=:countryName",
                        Country.class);
        query.setParameter("countryName", countryName);

        return query.getSingleResult();
    }

    @Override
    public List<Country> findAllCountriesWithFirstLetter(String firstLetter) {
        TypedQuery<Country> query = (TypedQuery<Country>) entityManager.
                createNativeQuery("""
                                SELECT * FROM Country
                                WHERE country_name LIKE :firstLetter
                                ORDER BY country_name""",
                        Country.class);
        query.setParameter("firstLetter", firstLetter.toUpperCase() + "%");
        return query.getResultList();
    }

    @Override
    public List<Country> findAllByPopulation() {
        TypedQuery<Country> query = entityManager.
                createQuery("FROM Country ORDER BY (population) DESC",
                        Country.class);

        return query.getResultList();
    }

    @Override
    public List<Country> findLargestCountriesByPopulation(int numberOfCountries) {
        TypedQuery<Country> query = entityManager.createQuery("FROM Country" +
                        "ORDER BY (population) DESC ",
                Country.class);
        query.setMaxResults(numberOfCountries);
        List<Country> countries = query.getResultList();
        return countries;
    }

    @Override
    public List<Country> findAllByCapital() {
        TypedQuery<Country> query = entityManager.createQuery("FROM Country ORDER BY (capital)",
                Country.class);
        List<Country> countries = query.getResultList();

        return countries;
    }

    @Override
    public Country findByCapital(String capital) {
        TypedQuery<Country> query = entityManager.createQuery("FROM Country WHERE capital=:capital",
                Country.class);
        query.setParameter("capital", capital);
        return query.getSingleResult();
    }

    @Override
    public List<Country> findAllCapitalsWithFirstLetter(String startingLetter) {
        TypedQuery<Country> query = (TypedQuery<Country>) entityManager.
                createNativeQuery("""
                                SELECT * FROM Country
                                WHERE capital LIKE :capital
                                ORDER BY capital""",
                        Country.class);
        query.setParameter("capital", startingLetter.toUpperCase() + "%");
        return query.getResultList();
    }

}
