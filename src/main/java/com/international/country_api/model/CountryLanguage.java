package com.international.country_api.model;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class CountryLanguage {

    @EmbeddedId
    private CountryLanguageId id;

    @Column(name = "is_official", nullable = false)
    private Boolean isOfficial;

    @ManyToOne
    @JoinColumn(name = "countryCode", insertable = false, updatable = false)
    private Country country;
}
