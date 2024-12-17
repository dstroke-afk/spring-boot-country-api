package com.international.country_api.model;

import java.io.Serializable;

import jakarta.persistence.*;

@Embeddable
public class CountryLanguageId implements Serializable {

    @Column(name = "CountryCode")
    private String countryCode;

    @Column(name = "Language")
    private String language;

    // Getters, setters, equals, and hashCode are typically required for composite keys
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

    // Override equals and hashCode to correctly handle composite keys
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CountryLanguageId that = (CountryLanguageId) o;
        return countryCode.equals(that.countryCode) && language.equals(that.language);
    }

    @Override
    public int hashCode() {
        return 31 * countryCode.hashCode() + language.hashCode();
    }
}
