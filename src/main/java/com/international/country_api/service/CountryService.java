package com.international.country_api.service;

import com.international.country_api.dto.CityDTO;
import com.international.country_api.dto.CountryDTO;
import com.international.country_api.dto.LanguageDTO;
import com.international.country_api.model.Country;
import com.international.country_api.repository.CountryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CountryService {

    @Autowired
    private CountryRepository countryRepository;

    public List<CountryDTO> getAllCountries() {
        return countryRepository.findAll().stream()
                .map(this::convertToDTO)
                .toList();
    }

    public Optional<CountryDTO> getCountryByCode(String code) {
        return countryRepository.findById(code)
                .map(this::convertToDTO);
    }

    private CountryDTO convertToDTO(Country country) {
        CountryDTO dto = new CountryDTO();
        dto.setCode(country.getCode());
        dto.setName(country.getName());
        dto.setContinent(country.getContinent());
        dto.setRegion(country.getRegion());
        dto.setPopulation(country.getPopulation());

        // Convert cities to DTOs
        dto.setCities(country.getCities().stream()
                .map(city -> {
                    CityDTO cityDTO = new CityDTO();
                    cityDTO.setName(city.getName());
                    cityDTO.setDistrict(city.getDistrict());
                    cityDTO.setPopulation(city.getPopulation());
                    return cityDTO;
                }).toList());

        // Convert languages to DTOs
        dto.setCountryLanguages(country.getCountryLanguages().stream()
                .map(language -> {
                    LanguageDTO languageDTO = new LanguageDTO();
                    languageDTO.setLanguage(language.getId().getLanguage());
                    languageDTO.setIsOfficial(language.getIsOfficial());
                    languageDTO.setPercentage(language.getPercentage());
                    return languageDTO;
                }).toList());

        return dto;
    }
}
