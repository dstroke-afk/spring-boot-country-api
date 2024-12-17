package com.international.country_api.model;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data  // Lombok will generate getters, setters, toString, equals, and hashCode methods.
public class CountryLanguage {

    @Id
    @ManyToOne
    @JoinColumn(name = "country_code", nullable = false)
    private Country country;

    @Id
    @Column(name = "language")
    private String language;

    @Column(name = "is_official", nullable = false)
    private Boolean isOfficial;
}
