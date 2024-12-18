package com.international.country_api.model;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "countrylanguage")
@Data
public class CountryLanguage {

    @EmbeddedId
    private CountryLanguageId id;

    @Column(name = "IsOfficial")
    private String isOfficial;

    @Column(name = "Percentage")
    private Double percentage;

    @ManyToOne
    @JoinColumn(name = "CountryCode", insertable = false, updatable = false)
    private Country country;
}
