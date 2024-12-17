package com.international.country_api.model;

import jakarta.persistence.Embeddable;
import lombok.Data;

import java.io.Serializable;

@Embeddable
@Data
public class CountryLanguageId implements Serializable {

    private String countryCode;
    private String language;
}
