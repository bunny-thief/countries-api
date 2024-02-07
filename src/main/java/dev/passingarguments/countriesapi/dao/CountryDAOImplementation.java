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

}
