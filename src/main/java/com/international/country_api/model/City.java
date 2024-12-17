package com.international.country_api.model;

import jakarta.persistence.*;

@Entity
public class City {

    @Id
    private Integer id;
    private String name;
    private String district;
    private Long population;

    @ManyToOne
    private Country country;

    // Getters and Setters
}
