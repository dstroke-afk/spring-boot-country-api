package com.international.country_api.model;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Entity
@Data
public class Country {

    @Id
    @Column(name = "code")
    private String code;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private String continent;

    @Column(nullable = false)
    private String region;

    @Column(nullable = false)
    private Integer population;

    @OneToMany(mappedBy = "country", fetch = FetchType.LAZY)
    private List<City> cities;

    @OneToMany(mappedBy = "country", fetch = FetchType.LAZY)
    private List<CountryLanguage> countryLanguages;
}
