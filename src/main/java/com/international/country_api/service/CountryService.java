package com.international.country_api.service;

import com.international.country_api.dto.CityDTO;
import com.international.country_api.dto.CountryDTO;
import com.international.country_api.dto.LanguageDTO;
import com.international.country_api.model.City;
import com.international.country_api.model.Country;
import com.international.country_api.model.CountryLanguage;
import com.international.country_api.repository.CountryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class CountryService {

    @Autowired
    private CountryRepository countryRepository;

    public List<CountryDTO> getAllCountries() {
        List<Country> countries = countryRepository.findAll();
        List<CountryDTO> countryDTOs = new ArrayList<>();

        for (Country country : countries) {
            countryDTOs.add(convertToDTO(country));
        }

        return countryDTOs;
    }

    public Optional<CountryDTO> getCountryByCode(String code) {
        Optional<Country> country = countryRepository.findById(code);
        if (country.isPresent()) {
            return Optional.of(convertToDTO(country.get()));
        }
        return Optional.empty();
    }

    private CountryDTO convertToDTO(Country country) {
        CountryDTO dto = new CountryDTO();
        dto.setCode(country.getCode());
        dto.setName(country.getName());
        dto.setContinent(country.getContinent());
        dto.setRegion(country.getRegion());
        dto.setPopulation(country.getPopulation());

        // Convert cities to DTOs without lambda
        List<CityDTO> cityDTOs = new ArrayList<>();
        for (City city : country.getCities()) {
            CityDTO cityDTO = new CityDTO();
            cityDTO.setName(city.getName());
            cityDTO.setDistrict(city.getDistrict());
            cityDTO.setPopulation(city.getPopulation());
            cityDTOs.add(cityDTO);
        }
        dto.setCities(cityDTOs);

        // Convert country languages to DTOs without lambda
        List<LanguageDTO> languageDTOs = new ArrayList<>();
        for (CountryLanguage language : country.getCountryLanguages()) {
            LanguageDTO languageDTO = new LanguageDTO();
            languageDTO.setLanguage(language.getId().getLanguage());
            languageDTO.setIsOfficial(language.getIsOfficial());
            languageDTO.setPercentage(language.getPercentage());
            languageDTOs.add(languageDTO);
        }
        dto.setCountryLanguages(languageDTOs);

        return dto;
    }
}
