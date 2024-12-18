package com.international.country_api.dto;

import java.util.List;

import lombok.Data;

@Data
public class CountryDTO {
    private String code;
    private String name;
    private String continent;
    private String region;
    private Integer population;
    private List<CityDTO> cities;
    private List<LanguageDTO> countryLanguages;

}

