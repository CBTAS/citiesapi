package com.github.CBTAS.citiesapi.countries.repository;

import com.github.CBTAS.citiesapi.countries.Country;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CountryRepository extends JpaRepository<Country, Long> {
}
