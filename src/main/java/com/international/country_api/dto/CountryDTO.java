package com.international.country_api.dto;

import lombok.Data;
import java.util.List;
import com.international.country_api.dto.CityDTO;

@Data
public class CountryDTO {
    private String code;
	private String name;
    private String continent;
    private String region;
    private Integer population;
    private List<CityDTO> cities;
    private List<LanguageDTO> countryLanguages;
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getContinent() {
		return continent;
	}
	public void setContinent(String continent) {
		this.continent = continent;
	}
	public String getRegion() {
		return region;
	}
	public void setRegion(String region) {
		this.region = region;
	}
	public Integer getPopulation() {
		return population;
	}
	public void setPopulation(Integer population) {
		this.population = population;
	}
	public List<CityDTO> getCities() {
		return cities;
	}
	public void setCities(List<CityDTO> cities) {
		this.cities = cities;
	}
	public List<LanguageDTO> getCountryLanguages() {
		return countryLanguages;
	}
	public void setCountryLanguages(List<LanguageDTO> countryLanguages) {
		this.countryLanguages = countryLanguages;
	}

}