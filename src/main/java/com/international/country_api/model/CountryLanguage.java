package com.international.country_api.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import jakarta.persistence.*;

@Entity
@Table(name = "countrylanguage")
@Data // Lombok annotation to generate getters, setters, toString, equals, and hashCode
@NoArgsConstructor // Lombok annotation for default constructor
@AllArgsConstructor // Lombok annotation for constructor with arguments
public class CountryLanguage {

    @EmbeddedId
    private CountryLanguageId id; // Composite key class

    @Column(name = "IsOfficial")
    private String isOfficial;

    @Column(name = "Percentage")
    private Double percentage;

    @ManyToOne
    @JoinColumn(name = "CountryCode", insertable = false, updatable = false)
    private Country country;

    // For completeness, if you need direct access to CountryCode and Language as individual fields
    @Transient
    public String getCountryCode() {
        return id != null ? id.getCountryCode() : null;
    }

    @Transient
    public String getLanguage() {
        return id != null ? id.getLanguage() : null;
    }
}
