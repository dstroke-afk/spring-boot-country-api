package com.international.country_api.dto;

import lombok.Data;

@Data
public class LanguageDTO {
    private String language;
    private String isOfficial;
    private Double percentage;

}