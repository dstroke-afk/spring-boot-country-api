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

	public CountryLanguageId getId() {
		return id;
	}

	public void setId(CountryLanguageId id) {
		this.id = id;
	}

	public String getIsOfficial() {
		return isOfficial;
	}

	public void setIsOfficial(String isOfficial) {
		this.isOfficial = isOfficial;
	}

	public Double getPercentage() {
		return percentage;
	}

	public void setPercentage(Double percentage) {
		this.percentage = percentage;
	}

	public Country getCountry() {
		return country;
	}

	public void setCountry(Country country) {
		this.country = country;
	}
    
}
