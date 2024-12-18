package com.international.country_api.service;

import com.international.country_api.dto.CountryDTO;
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

    public List<Country> getAllCountries() {
        return countryRepository.findAll();
    }

    public Optional<CountryDTO> getCountryByCode(String code) {
        return countryRepository.findById(code).map(country -> {
            CountryDTO dto = new CountryDTO();
            dto.setCode(country.getCode());
            dto.setName(country.getName());
            dto.setContinent(country.getContinent());
            dto.setRegion(country.getRegion());
            dto.setPopulation(country.getPopulation());

            // Convert cities
            dto.setCities(country.getCities().stream()
                .map(city -> {
                    CityDTO cityDTO = new CityDTO();
                    cityDTO.setName(city.getName());
                    cityDTO.setDistrict(city.getDistrict());
                    cityDTO.setPopulation(city.getPopulation());
                    return cityDTO;
                }).toList());

            // Convert languages
            dto.setCountryLanguages(country.getCountryLanguages().stream()
                .map(lang -> {
                    LanguageDTO langDTO = new LanguageDTO();
                    langDTO.setLanguage(lang.getId().getLanguage());
                    langDTO.setIsOfficial(lang.getIsOfficial());
                    langDTO.setPercentage(lang.getPercentage());
                    return langDTO;
                }).toList());

            return dto;
        });
    }
}
