package com.international.country_api.model;

import jakarta.persistence.*;
import java.util.List;

@Entity
public class Country {

    @Id
    private String code;

    private String name;
    private String continent;
    private String region;
    private Long population;

    @OneToMany(mappedBy = "country")
    private List<City> cities;

    @OneToMany(mappedBy = "country")
    private List<CountryLanguage> languages;

    // Getters and Setters
}
