package com.international.country_api.model;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class City {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private String district;

    @Column(nullable = false)
    private Integer population;

    @ManyToOne
    @JoinColumn(name = "CountryCode", nullable = false)
    private Country country;
}
