package com.international.country_api.model;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;


import java.io.Serializable;

@Embeddable
public class CountryLanguageId implements Serializable {

    @Column(name = "CountryCode")
    private String countryCode;

    @Column(name = "Language")
    private String language;

	public String getCountryCode() {
		return countryCode;
	}

	public void setCountryCode(String countryCode) {
		this.countryCode = countryCode;
	}

	public String getLanguage() {
		return language;
	}

	public void setLanguage(String language) {
		this.language = language;
	}
    
    
}
