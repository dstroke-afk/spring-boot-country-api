package com.international.country_api.model;

import jakarta.persistence.*;

@Entity
public class CountryLanguage {

    @Id
    @Column(name = "country_code")
    private String countryCode;

    private String language;
    private Boolean isOfficial;
    private Double percentage;

    @ManyToOne
    @JoinColumn(name = "country_code", referencedColumnName = "code", insertable = false, updatable = false)
    private Country country;

    // Getters and Setters
}
