package com.international.country_api.dto;

public class LanguageDTO {
    private String language;
    private String isOfficial;
    private Double percentage;
	public String getLanguage() {
		return language;
	}
	public void setLanguage(String language) {
		this.language = language;
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
    
}
