package com.trendyol.toyrobot.repository;

import com.trendyol.toyrobot.domain.Country;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface CountryRepository extends JpaRepository<Country, Long> {

    Optional<Country> findCountryByCode(String code);
}
