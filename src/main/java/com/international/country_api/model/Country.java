package com.international.country_api.model;

import java.util.List;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data  // Lombok will generate getters, setters, toString, equals, and hashCode methods.
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

    @OneToMany(mappedBy = "country", fetch = FetchType.EAGER)
    private List<City> cities;

    @OneToMany(mappedBy = "country", fetch = FetchType.EAGER)
    private List<CountryLanguage> countryLanguages;
}
