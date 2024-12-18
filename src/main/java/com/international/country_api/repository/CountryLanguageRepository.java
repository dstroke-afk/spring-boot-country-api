package com.international.country_api.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.international.country_api.model.CountryLanguage;

public interface CountryLanguageRepository extends JpaRepository<CountryLanguage, String> {
}
