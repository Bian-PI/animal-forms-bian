package com.bian.animalformsbian.adapter.driving.http.dto;

import java.util.Map;

public class HealthDto extends BaseSectionDto {
    public HealthDto() {
    }

    public HealthDto(String score, Map<String, String> responses) {
        super(score, responses);
    }
}
