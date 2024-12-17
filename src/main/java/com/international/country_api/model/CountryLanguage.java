package com.international.country_api.model;

import jakarta.persistence.*;

@Entity
public class CountryLanguage {

    @Id
    private String countryCode;
    private String language;
    private Boolean isOfficial;
    private Double percentage;

    @ManyToOne
    private Country country;

    // Getters and Setters
}